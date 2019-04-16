package com.zx.service;

import com.zx.pojo.Detail;

import java.util.List;

public interface DetailService {
    /**
     * 根据id查询回复内容
     * @param id
     * @return
     */
    List<Detail> selectDataListById(int id);

    /**
     * 保存添加
     * @param detail
     * @return
     */
    int addDetailByDetail(Detail detail);
}
