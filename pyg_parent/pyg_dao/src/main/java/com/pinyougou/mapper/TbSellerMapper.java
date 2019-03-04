package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSeller;
import com.pinyougou.pojo.TbSellerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSellerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int countByExample(TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByExample(TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByPrimaryKey(Long sellerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insert(TbSeller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insertSelective(TbSeller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    List<TbSeller> selectByExample(TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    TbSeller selectByPrimaryKey(Long sellerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExample(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKeySelective(TbSeller record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKey(TbSeller record);
}