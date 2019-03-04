package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbSeckillOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.seckill_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private Long seckillId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.money
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.user_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.seller_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.create_time
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.pay_time
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.status
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.receiver_address
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String receiverAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.receiver_mobile
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String receiverMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.receiver
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String receiver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seckill_order.transaction_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String transactionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.id
     *
     * @return the value of tb_seckill_order.id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.id
     *
     * @param id the value for tb_seckill_order.id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.seckill_id
     *
     * @return the value of tb_seckill_order.seckill_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public Long getSeckillId() {
        return seckillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.seckill_id
     *
     * @param seckillId the value for tb_seckill_order.seckill_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.money
     *
     * @return the value of tb_seckill_order.money
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.money
     *
     * @param money the value for tb_seckill_order.money
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.user_id
     *
     * @return the value of tb_seckill_order.user_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.user_id
     *
     * @param userId the value for tb_seckill_order.user_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.seller_id
     *
     * @return the value of tb_seckill_order.seller_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.seller_id
     *
     * @param sellerId the value for tb_seckill_order.seller_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.create_time
     *
     * @return the value of tb_seckill_order.create_time
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.create_time
     *
     * @param createTime the value for tb_seckill_order.create_time
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.pay_time
     *
     * @return the value of tb_seckill_order.pay_time
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.pay_time
     *
     * @param payTime the value for tb_seckill_order.pay_time
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.status
     *
     * @return the value of tb_seckill_order.status
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.status
     *
     * @param status the value for tb_seckill_order.status
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.receiver_address
     *
     * @return the value of tb_seckill_order.receiver_address
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.receiver_address
     *
     * @param receiverAddress the value for tb_seckill_order.receiver_address
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.receiver_mobile
     *
     * @return the value of tb_seckill_order.receiver_mobile
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.receiver_mobile
     *
     * @param receiverMobile the value for tb_seckill_order.receiver_mobile
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.receiver
     *
     * @return the value of tb_seckill_order.receiver
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.receiver
     *
     * @param receiver the value for tb_seckill_order.receiver
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seckill_order.transaction_id
     *
     * @return the value of tb_seckill_order.transaction_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seckill_order.transaction_id
     *
     * @param transactionId the value for tb_seckill_order.transaction_id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }
}