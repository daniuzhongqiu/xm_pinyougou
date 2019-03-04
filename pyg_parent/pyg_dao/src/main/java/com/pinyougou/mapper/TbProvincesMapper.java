package com.pinyougou.mapper;

import com.pinyougou.pojo.TbProvinces;
import com.pinyougou.pojo.TbProvincesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProvincesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int countByExample(TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByExample(TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insert(TbProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insertSelective(TbProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    List<TbProvinces> selectByExample(TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    TbProvinces selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbProvinces record, @Param("example") TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExample(@Param("record") TbProvinces record, @Param("example") TbProvincesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKeySelective(TbProvinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_provinces
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKey(TbProvinces record);
}