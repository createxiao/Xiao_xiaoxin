package com.xiaoxin.create.dao;

import com.xiaoxin.create.pojo.TbItem;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}