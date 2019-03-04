package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int countByExample(TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByExample(TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insert(TbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insertSelective(TbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    List<TbBrand> selectByExample(TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    TbBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKeySelective(TbBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKey(TbBrand record);

    List<Map> findByList();
}