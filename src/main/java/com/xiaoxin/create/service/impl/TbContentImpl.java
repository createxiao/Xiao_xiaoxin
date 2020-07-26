package com.xiaoxin.create.service.impl;

import com.xiaoxin.create.dao.TbContentMapper;
import com.xiaoxin.create.pojo.TbContent;
import com.xiaoxin.create.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbContentImpl implements TbContentService {

    @Autowired
    private TbContentMapper tbContentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(TbContent record) {
        return 0;
    }

    @Override
    public int insertSelective(TbContent record) {
        return 0;
    }

    @Override
    public TbContent selectByPrimaryKey(Long id) {
        return tbContentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbContent record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TbContent record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbContent record) {
        return 0;
    }
}
