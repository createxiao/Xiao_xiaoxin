package com.xiaoxin.create;


import com.xiaoxin.create.pojo.TbContent;
import com.xiaoxin.create.pojo.TbItemCat;
import com.xiaoxin.create.pojo.TbItemCatExample;
import com.xiaoxin.create.pojo.Vo.EutreeNode;
import com.xiaoxin.create.service.TbContentService;
import com.xiaoxin.create.service.TbltemCatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CreateApplicationTests {

    @Autowired
    private TbContentService tbContentService;

    @Autowired
    private TbltemCatService tbltemCatService;

    @Test
    void contextLoads() {
        TbContent tbContent =tbContentService.selectByPrimaryKey((long) 28);
        System.out.println(tbContent);
    }
    
    @Test
    public void treenode(){
        /*** 
        * @Description: 带查询条件example,返回商品类别
        * @Param: [] 
        * @return: java.util.List 
        * @Author: zhiqiang_xiao
        * @Date: 2020/7/26 
        */
        TbItemCatExample example =new TbItemCatExample();
        TbItemCatExample.Criteria criteria =example.createCriteria();
        criteria.andParentIdEqualTo((long) 1);
        List<TbItemCat> list= tbltemCatService.selectByExample(example);
        List<EutreeNode> arrayList= new ArrayList<EutreeNode>();
        for ( TbItemCat tbItemCat:list) {
                EutreeNode eutreeNode=new EutreeNode();
                eutreeNode.setId(tbItemCat.getId());
                eutreeNode.setState(tbItemCat.getName());
                eutreeNode.setState(tbItemCat.getIsParent()?"closed":"open");
                arrayList.add(eutreeNode);
        }
        for (EutreeNode e:arrayList
             ) {
            System.out.println(e);
        }

    }

}
