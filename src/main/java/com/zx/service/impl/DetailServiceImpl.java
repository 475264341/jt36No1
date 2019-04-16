package com.zx.service.impl;

import com.zx.dao.DetailDao;
import com.zx.pojo.Detail;
import com.zx.service.DetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    //注入dao
    @Resource
    private DetailDao detailDao;

    //根据id查询回复内容
    @Override
    public List<Detail> selectDataListById(int id) {

        return detailDao.selectDataListById(id);
    }


//保存回复
    @Override
    public int addDetailByDetail(Detail detail) {
        return detailDao.addDetailByDetail(detail);
    }

}
