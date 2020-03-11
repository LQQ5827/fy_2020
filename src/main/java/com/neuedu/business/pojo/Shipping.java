package com.neuedu.business.pojo;

import java.util.Date;

public class Shipping {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_name
     *
     * @mbg.generated
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_phone
     *
     * @mbg.generated
     */
    private String receiverPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_mobile
     *
     * @mbg.generated
     */
    private String receiverMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_province
     *
     * @mbg.generated
     */
    private String receiverProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_city
     *
     * @mbg.generated
     */
    private String receiverCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_district
     *
     * @mbg.generated
     */
    private String receiverDistrict;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_address
     *
     * @mbg.generated
     */
    private String receiverAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.receiver_zip
     *
     * @mbg.generated
     */
    private String receiverZip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_shipping.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.id
     *
     * @return the value of neuedu_shipping.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.id
     *
     * @param id the value for neuedu_shipping.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.user_id
     *
     * @return the value of neuedu_shipping.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.user_id
     *
     * @param userId the value for neuedu_shipping.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_name
     *
     * @return the value of neuedu_shipping.receiver_name
     *
     * @mbg.generated
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_name
     *
     * @param receiverName the value for neuedu_shipping.receiver_name
     *
     * @mbg.generated
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_phone
     *
     * @return the value of neuedu_shipping.receiver_phone
     *
     * @mbg.generated
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_phone
     *
     * @param receiverPhone the value for neuedu_shipping.receiver_phone
     *
     * @mbg.generated
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_mobile
     *
     * @return the value of neuedu_shipping.receiver_mobile
     *
     * @mbg.generated
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_mobile
     *
     * @param receiverMobile the value for neuedu_shipping.receiver_mobile
     *
     * @mbg.generated
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_province
     *
     * @return the value of neuedu_shipping.receiver_province
     *
     * @mbg.generated
     */
    public String getReceiverProvince() {
        return receiverProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_province
     *
     * @param receiverProvince the value for neuedu_shipping.receiver_province
     *
     * @mbg.generated
     */
    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince == null ? null : receiverProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_city
     *
     * @return the value of neuedu_shipping.receiver_city
     *
     * @mbg.generated
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_city
     *
     * @param receiverCity the value for neuedu_shipping.receiver_city
     *
     * @mbg.generated
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_district
     *
     * @return the value of neuedu_shipping.receiver_district
     *
     * @mbg.generated
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_district
     *
     * @param receiverDistrict the value for neuedu_shipping.receiver_district
     *
     * @mbg.generated
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_address
     *
     * @return the value of neuedu_shipping.receiver_address
     *
     * @mbg.generated
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_address
     *
     * @param receiverAddress the value for neuedu_shipping.receiver_address
     *
     * @mbg.generated
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.receiver_zip
     *
     * @return the value of neuedu_shipping.receiver_zip
     *
     * @mbg.generated
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.receiver_zip
     *
     * @param receiverZip the value for neuedu_shipping.receiver_zip
     *
     * @mbg.generated
     */
    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.create_time
     *
     * @return the value of neuedu_shipping.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.create_time
     *
     * @param createTime the value for neuedu_shipping.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_shipping.update_time
     *
     * @return the value of neuedu_shipping.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_shipping.update_time
     *
     * @param updateTime the value for neuedu_shipping.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}