package com.zx.service.impl;

import com.zx.dao.InvitationDao;
import com.zx.pojo.Invitation;
import com.zx.pojo.Page;
import com.zx.service.InvitationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//对象
@Service
public class InvitationServiceImpl implements InvitationService {
    //注入
    @Resource
    private InvitationDao invitationDao;
//分页查询
    @Override
    public Page<Invitation> queryPage(int currentPage,String title) {
        if(currentPage<=0){
            currentPage=1;
        }
        //显示多少行
        int rows=5;
        //查询总记录数 含模糊查询
        int countPage=invitationDao.findCountPag(title);

        int totalPage=(countPage+rows-1)/rows;//总页数
        if(currentPage>=totalPage){
            currentPage=totalPage;
        }
        //根据分页查询list表格
        //起始位置
        int start=(currentPage-1)*rows;
        List<Invitation> invitationList=invitationDao.selectInvitationList(start,rows,title);
        //封装对象

        //返回对象
        return new Page( currentPage,rows,countPage,totalPage,invitationList);
    }



    //根据id删除帖子
    @Override
    public int delInvitationById(int id) {

        return invitationDao.delInvitationById(id);
    }
}
