package com.pinyougou.content.service.impl;

import java.util.List;
import java.util.Map;

import com.pinyougou.mapper.TbSpecificationOptionMapper;
import com.pinyougou.pojo.TbSpecificationOption;
import com.pinyougou.pojo.TbSpecificationOptionExample;
import entity.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbSpecificationMapper;
import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojo.TbSpecificationExample;
import com.pinyougou.pojo.TbSpecificationExample.Criteria;
import com.pinyougou.content.service.SpecificationService;

import entity.PageResult;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private TbSpecificationMapper specificationMapper;

    @Autowired
    private TbSpecificationOptionMapper tbSpecificationOptionMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbSpecification> findAll() {
        return specificationMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbSpecification> page1 = (Page<TbSpecification>) specificationMapper.selectByExample(null);
        return new PageResult(page1.getTotal(), page1.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Specification specification) {
        TbSpecification tbSpecification = specification.getSpecification();
        System.out.println(tbSpecification.getSpecName());
        specificationMapper.insert(tbSpecification);

        List<TbSpecificationOption> options = specification.getSpecificationOptions();
        for (TbSpecificationOption option : options) {
            tbSpecificationOptionMapper.insert(option);
        }
    }


    /**
     * 修改
     */
    @Override
    public void update(Specification specification) {
        TbSpecification specification1 = specification.getSpecification();
        specificationMapper.updateByPrimaryKey(specification1);

        //先全部删除
        TbSpecificationOptionExample example = new TbSpecificationOptionExample();
        example.createCriteria().andSpecIdEqualTo(specification1.getId());
        tbSpecificationOptionMapper.deleteByExample(example);

        //在添加
        List<TbSpecificationOption> options = specification.getSpecificationOptions();
        for (TbSpecificationOption option : options) {
            option.setSpecId(specification1.getId());
            tbSpecificationOptionMapper.insert(option);
        }

    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public Specification findOne(Long id) {
        Specification spec = new Specification();
        TbSpecification tbSpecification = specificationMapper.selectByPrimaryKey(id);
        spec.setSpecification(tbSpecification);

        TbSpecificationOptionExample tbSpecificationOptionExample = new TbSpecificationOptionExample();
        TbSpecificationOptionExample.Criteria criteria = tbSpecificationOptionExample.createCriteria();
        criteria.andSpecIdEqualTo(id);

        List<TbSpecificationOption> tbSpecificationOptions = tbSpecificationOptionMapper.selectByExample(tbSpecificationOptionExample);
        spec.setSpecificationOptions(tbSpecificationOptions);

        return spec;
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            specificationMapper.deleteByPrimaryKey(id);
        }
    }




    @Override
    public PageResult findPage(TbSpecification specification, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbSpecificationExample example = new TbSpecificationExample();
        Criteria criteria = example.createCriteria();

        if (specification != null) {
            if (specification.getSpecName() != null && specification.getSpecName().length() > 0) {
                criteria.andSpecNameLike("%" + specification.getSpecName() + "%");
            }

        }

        Page<TbSpecification> page = (Page<TbSpecification>) specificationMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

    @Override
    public List<Map> findBySpecList() {
        return specificationMapper.findBySpecList();
    }

}
