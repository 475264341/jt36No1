package com.zx.dao;

import com.zx.pojo.Invitation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvitationDao {
    /**
     * 查询总记录数 总行数
     * @return
     */
    int findCountPag(@Param("title") String title);


    /**
     * 分页查询  根据 开始页  结束页
     * @param start
     * @param rows
     * @return
     */
    List<Invitation> selectInvitationList(@Param("start")int start, @Param("rows")int rows,@Param("title")String title);

    /**
     * 根据id删除帖子
     * @param id
     * @return
     */
    int delInvitationById(@Param("id")int id);
}
