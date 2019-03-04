package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSeckillOrder;
import com.pinyougou.pojo.TbSeckillOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSeckillOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int countByExample(TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByExample(TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insert(TbSeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int insertSelective(TbSeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    TbSeckillOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByExample(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKeySelective(TbSeckillOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seckill_order
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    int updateByPrimaryKey(TbSeckillOrder record);
}