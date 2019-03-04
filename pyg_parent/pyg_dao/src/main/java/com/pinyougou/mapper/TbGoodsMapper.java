package com.pinyougou.mapper;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int countByExample(TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByExample(TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insert(TbGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insertSelective(TbGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    List<TbGoods> selectByExample(TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    TbGoods selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKeySelective(TbGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKey(TbGoods record);
}