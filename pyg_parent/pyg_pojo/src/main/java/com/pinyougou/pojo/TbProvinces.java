package com.pinyougou.pojo;

import java.io.Serializable;

public class TbProvinces implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.provinceid
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.province
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    private String province;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.id
     *
     * @return the value of tb_provinces.id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.id
     *
     * @param id the value for tb_provinces.id
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.provinceid
     *
     * @return the value of tb_provinces.provinceid
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.provinceid
     *
     * @param provinceid the value for tb_provinces.provinceid
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.province
     *
     * @return the value of tb_provinces.province
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.province
     *
     * @param province the value for tb_provinces.province
     *
     * @mbggenerated Sat Mar 02 19:58:13 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}