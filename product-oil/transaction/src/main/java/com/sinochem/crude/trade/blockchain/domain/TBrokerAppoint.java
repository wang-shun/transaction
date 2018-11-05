package com.sinochem.crude.trade.blockchain.domain;

import java.util.Date;

public class TBrokerAppoint {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.ID
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Long id;

    public String getDealUuid() {
        return dealUuid;
    }

    public void setDealUuid(String uuid) {
        this.dealUuid = uuid;
    }

    private String dealUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.deal_no
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private String dealNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.enterprise_id
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Long enterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.enterprise_name
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private String enterpriseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.appoint_enterprise_id
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Long appointEnterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.appoint_enterprise_name
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private String appointEnterpriseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.status
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.ALIVE_FLAG
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private String aliveFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.CREATE_DATE
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.UPDATE_DATE
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.CREATE_USER
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Long createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_broker_appoint.UPDATE_USER
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    private Long updateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.ID
     *
     * @return the value of t_broker_appoint.ID
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.ID
     *
     * @param id the value for t_broker_appoint.ID
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.deal_no
     *
     * @return the value of t_broker_appoint.deal_no
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public String getDealNo() {
        return dealNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.deal_no
     *
     * @param dealNo the value for t_broker_appoint.deal_no
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setDealNo(String dealNo) {
        this.dealNo = dealNo == null ? null : dealNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.enterprise_id
     *
     * @return the value of t_broker_appoint.enterprise_id
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.enterprise_id
     *
     * @param enterpriseId the value for t_broker_appoint.enterprise_id
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.enterprise_name
     *
     * @return the value of t_broker_appoint.enterprise_name
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.enterprise_name
     *
     * @param enterpriseName the value for t_broker_appoint.enterprise_name
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.appoint_enterprise_id
     *
     * @return the value of t_broker_appoint.appoint_enterprise_id
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Long getAppointEnterpriseId() {
        return appointEnterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.appoint_enterprise_id
     *
     * @param appointEnterpriseId the value for t_broker_appoint.appoint_enterprise_id
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setAppointEnterpriseId(Long appointEnterpriseId) {
        this.appointEnterpriseId = appointEnterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.appoint_enterprise_name
     *
     * @return the value of t_broker_appoint.appoint_enterprise_name
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public String getAppointEnterpriseName() {
        return appointEnterpriseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.appoint_enterprise_name
     *
     * @param appointEnterpriseName the value for t_broker_appoint.appoint_enterprise_name
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setAppointEnterpriseName(String appointEnterpriseName) {
        this.appointEnterpriseName = appointEnterpriseName == null ? null : appointEnterpriseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.status
     *
     * @return the value of t_broker_appoint.status
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.status
     *
     * @param status the value for t_broker_appoint.status
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.ALIVE_FLAG
     *
     * @return the value of t_broker_appoint.ALIVE_FLAG
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public String getAliveFlag() {
        return aliveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.ALIVE_FLAG
     *
     * @param aliveFlag the value for t_broker_appoint.ALIVE_FLAG
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setAliveFlag(String aliveFlag) {
        this.aliveFlag = aliveFlag == null ? null : aliveFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.CREATE_DATE
     *
     * @return the value of t_broker_appoint.CREATE_DATE
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.CREATE_DATE
     *
     * @param createDate the value for t_broker_appoint.CREATE_DATE
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.UPDATE_DATE
     *
     * @return the value of t_broker_appoint.UPDATE_DATE
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.UPDATE_DATE
     *
     * @param updateDate the value for t_broker_appoint.UPDATE_DATE
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.CREATE_USER
     *
     * @return the value of t_broker_appoint.CREATE_USER
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.CREATE_USER
     *
     * @param createUser the value for t_broker_appoint.CREATE_USER
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_broker_appoint.UPDATE_USER
     *
     * @return the value of t_broker_appoint.UPDATE_USER
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_broker_appoint.UPDATE_USER
     *
     * @param updateUser the value for t_broker_appoint.UPDATE_USER
     *
     * @mbggenerated Thu Sep 06 16:31:04 CST 2018
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
}