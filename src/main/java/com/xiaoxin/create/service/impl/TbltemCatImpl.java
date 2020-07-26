package com.xiaoxin.create.service.impl;

import com.xiaoxin.create.dao.TbItemCatMapper;
import com.xiaoxin.create.pojo.TbItemCat;
import com.xiaoxin.create.pojo.TbItemCatExample;
import com.xiaoxin.create.service.TbltemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Xiaozq on 2020/7/26 16:31
 */
@Service
public class TbltemCatImpl implements TbltemCatService {

    @Autowired
    private TbItemCatMapper tbltemCatMapper;

    @Override
    public long countByExample(TbItemCatExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TbItemCatExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(TbItemCat record) {
        return 0;
    }

    @Override
    public int insertSelective(TbItemCat record) {
        return 0;
    }

    @Override
    public List<TbItemCat> selectByExample(TbItemCatExample example) {
        return tbltemCatMapper.selectByExample(example);
    }

    @Override
    public TbItemCat selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(TbItemCat record, TbItemCatExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TbItemCat record, TbItemCatExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TbItemCat record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbItemCat record) {
        return 0;
    }
}
