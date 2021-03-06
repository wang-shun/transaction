package com.sinochem.crude.trade.listed.domain;

import java.util.Date;

public class TradingChain {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Long id;

    /**
     * 贸易链订单编号
     */
    private String serialNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.demand_id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Long demandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.uuid
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.status
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.operator_sum
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Integer operatorSum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.create_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.start_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.deadline
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Date deadline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.finish_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Date finishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.operators_id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private String operatorsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.alter_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Date alterTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.user_created
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Long userCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.user_modified
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Long userModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.alive_flag
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Integer aliveFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trading_chain.version
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    private Long version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.id
     *
     * @return the value of trading_chain.id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Long getId() {
        return id;
    }



    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.id
     *
     * @param id the value for trading_chain.id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.demand_id
     *
     * @return the value of trading_chain.demand_id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Long getDemandId() {
        return demandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.demand_id
     *
     * @param demandId the value for trading_chain.demand_id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setDemandId(Long demandId) {
        this.demandId = demandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.uuid
     *
     * @return the value of trading_chain.uuid
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.uuid
     *
     * @param uuid the value for trading_chain.uuid
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.status
     *
     * @return the value of trading_chain.status
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.status
     *
     * @param status the value for trading_chain.status
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.operator_sum
     *
     * @return the value of trading_chain.operator_sum
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Integer getOperatorSum() {
        return operatorSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.operator_sum
     *
     * @param operatorSum the value for trading_chain.operator_sum
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setOperatorSum(Integer operatorSum) {
        this.operatorSum = operatorSum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.create_time
     *
     * @return the value of trading_chain.create_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.create_time
     *
     * @param createTime the value for trading_chain.create_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.start_time
     *
     * @return the value of trading_chain.start_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.start_time
     *
     * @param startTime the value for trading_chain.start_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.deadline
     *
     * @return the value of trading_chain.deadline
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.deadline
     *
     * @param deadline the value for trading_chain.deadline
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.finish_time
     *
     * @return the value of trading_chain.finish_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.finish_time
     *
     * @param finishTime the value for trading_chain.finish_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.operators_id
     *
     * @return the value of trading_chain.operators_id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public String getOperatorsId() {
        return operatorsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.operators_id
     *
     * @param operatorsId the value for trading_chain.operators_id
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setOperatorsId(String operatorsId) {
        this.operatorsId = operatorsId == null ? null : operatorsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.alter_time
     *
     * @return the value of trading_chain.alter_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Date getAlterTime() {
        return alterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.alter_time
     *
     * @param alterTime the value for trading_chain.alter_time
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setAlterTime(Date alterTime) {
        this.alterTime = alterTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.user_created
     *
     * @return the value of trading_chain.user_created
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Long getUserCreated() {
        return userCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.user_created
     *
     * @param userCreated the value for trading_chain.user_created
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setUserCreated(Long userCreated) {
        this.userCreated = userCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.user_modified
     *
     * @return the value of trading_chain.user_modified
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Long getUserModified() {
        return userModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.user_modified
     *
     * @param userModified the value for trading_chain.user_modified
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setUserModified(Long userModified) {
        this.userModified = userModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.alive_flag
     *
     * @return the value of trading_chain.alive_flag
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Integer getAliveFlag() {
        return aliveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.alive_flag
     *
     * @param aliveFlag the value for trading_chain.alive_flag
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setAliveFlag(Integer aliveFlag) {
        this.aliveFlag = aliveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trading_chain.version
     *
     * @return the value of trading_chain.version
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trading_chain.version
     *
     * @param version the value for trading_chain.version
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    public void setVersion(Long version) {
        this.version = version;
    }


}