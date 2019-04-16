package com.zx.service;

import com.zx.pojo.Invitation;
import com.zx.pojo.Page;

import java.util.List;

public interface InvitationService {
    /**
     * 分页查询
     * @param currentPage
     * @return
     */
    Page<Invitation> queryPage(int currentPage,String title);



    /**
     * 删除帖子 根据id
     * @param id
     * @return
     */
    int delInvitationById(int id);
}
