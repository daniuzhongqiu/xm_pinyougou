package com.pinyougou.mapper;

import com.pinyougou.pojo.TbCities;
import com.pinyougou.pojo.TbCitiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int countByExample(TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByExample(TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insert(TbCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insertSelective(TbCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    List<TbCities> selectByExample(TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    TbCities selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExample(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKeySelective(TbCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKey(TbCities record);
}