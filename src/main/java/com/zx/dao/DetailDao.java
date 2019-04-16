package com.zx.dao;

import com.zx.pojo.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailDao {
    /**
     * 根据id查询回复
     * @param id
     * @return
     */
    List<Detail> selectDataListById(@Param("invid")int invid);


    /**
     * 保存回复
     * @param detail
     * @return
     */
    int addDetailByDetail(Detail detail);
}
