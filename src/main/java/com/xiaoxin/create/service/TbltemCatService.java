package com.xiaoxin.create.service;

import com.xiaoxin.create.pojo.TbItemCat;
import com.xiaoxin.create.pojo.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Xiaozq on 2020/7/26 16:30
 */
public interface TbltemCatService {
    long countByExample(TbItemCatExample example);

    int deleteByExample(TbItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);

    List<TbItemCat> selectByExample(TbItemCatExample example);

    TbItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    int updateByPrimaryKeySelective(TbItemCat record);

    int updateByPrimaryKey(TbItemCat record);
}
