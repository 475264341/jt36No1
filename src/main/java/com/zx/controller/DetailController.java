package com.zx.controller;

import com.zx.pojo.Detail;
import com.zx.service.DetailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DetailController {
    //注入
    @Resource
    private DetailService detailService;

    //查看回复
    @RequestMapping("/showDetaList/{id}")
    public String showDetaList(@PathVariable("id") int id, Model model) {
        List<Detail> detailList=detailService.selectDataListById(id);
        model.addAttribute("detailList",detailList);
        model.addAttribute("id",id);
        return "showInvList";
    }
    //跳转到添加页面
    @RequestMapping("/toAddDeta/{id}")
    public String toAddDeta(@PathVariable("id") int id,Model model){
        model.addAttribute("invid",id);
        return "addDetailList";
    }

    //保存回复
    @RequestMapping("/saveDetail")
    public String addDetail(Detail detail){
        int i=detailService.addDetailByDetail(detail);
        return "redirect:/showDetaList/"+detail.getInvid();
    }
}
