package com.zx.controller;

import com.zx.pojo.Invitation;
import com.zx.pojo.Page;
import com.zx.service.InvitationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class InvitationController {
    //注入InvitationService
    @Resource
    private InvitationService invitationService;
//分页查询
    @RequestMapping("/queryPage/{currentPage}")
    public String queryPage(@PathVariable("currentPage") int currentPage, Model model, String title){
        //判断
        if(currentPage <= 0 ){
            currentPage=1;
        }
        //根据页码查询
        Page<Invitation> page=invitationService.queryPage(currentPage,title);//返回帖子列表 根据分页，所以类型Page

        //返回数据
        model.addAttribute("page",page);
        model.addAttribute("title",title);
        return "invitationList";
    }


    //删除帖子
    @RequestMapping("/delInvitation/{id}")
    public String delInvitation(@PathVariable("id")int id){
        int i=invitationService.delInvitationById(id);
        return "redirect:/queryInvList/1";
    }
}
