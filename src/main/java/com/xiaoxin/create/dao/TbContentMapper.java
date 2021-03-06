package com.xiaoxin.create.dao;

import com.xiaoxin.create.pojo.TbContent;
import org.springframework.stereotype.Component;

@Component
public interface TbContentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}