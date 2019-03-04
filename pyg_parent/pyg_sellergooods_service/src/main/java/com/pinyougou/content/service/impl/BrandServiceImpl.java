package com.pinyougou.content.service.impl;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
//import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.pojo.TbBrandExample.Criteria;
import com.pinyougou.content.service.BrandService;

import entity.PageResult;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageSize, int pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(TbBrand brand) {
        brandMapper.insert(brand);
    }


    /**
     * 修改
     */
    @Override
    public void update(TbBrand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbBrand findOne(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            brandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbBrandExample example = new TbBrandExample();
        Criteria criteria = example.createCriteria();

        if (brand != null) {
            if (brand.getName() != null && brand.getName().length() > 0) {
                criteria.andNameLike("%" + brand.getName() + "%");
            }
            if (brand.getFirstChar() != null && brand.getFirstChar().length() > 0) {
                criteria.andFirstCharLike("%" + brand.getFirstChar() + "%");
            }

        }

        Page<TbBrand> page1 = (Page<TbBrand>) brandMapper.selectByExample(example);

        //System.out.println(page.getTotal() + "=====" + page.getResult());
        //System.out.println("哈哈");
        return new PageResult(page1.getTotal(), page1.getResult());
    }

    public PageResult findPageOne (TbBrand tbBrand, int pageNum, int pageNo) {
        PageHelper.startPage(pageNum, pageNo);

        TbBrandExample tbBrandExample = new TbBrandExample();
        Criteria criteria = tbBrandExample.createCriteria();

        if (tbBrand.getName() != null && tbBrand.getName() != "") {
            criteria.andNameLike("%" + tbBrand.getName() + "%");
        }
        if (tbBrand.getFirstChar() != null && tbBrand.getFirstChar() != "") {
            criteria.andFirstCharEqualTo(tbBrand.getFirstChar());
        }

        Page<TbBrand> page2 = (Page<TbBrand>) brandMapper.selectByExample(tbBrandExample);
        return new PageResult(page2.getTotal(), page2.getResult());
    }

    @Override
    public List<Map> findByList() {
        return brandMapper.findByList();
    }

}
