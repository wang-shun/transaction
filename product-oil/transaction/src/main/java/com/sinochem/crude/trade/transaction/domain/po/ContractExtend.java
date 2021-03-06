package com.sinochem.crude.trade.transaction.domain.po;

import java.math.BigDecimal;
import java.util.Date;

public class ContractExtend {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.id
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.gmt_created
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.gmt_modified
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.user_created
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Long userCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.user_modified
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Long userModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.alive_flag
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Integer aliveFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.version
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.ref_contract_id
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private Long refContractId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.contract_no
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private String contractNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.contract_date
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private String contractDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.settle_num
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private BigDecimal settleNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.settle_amt
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private BigDecimal settleAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.temp_invoice
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private String tempInvoice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.settle_invoice
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private String settleInvoice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.attr11
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private BigDecimal attr11;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.attr12
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private BigDecimal attr12;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.attr21
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private String attr21;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_contract_extend.attr22
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    private String attr22;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.id
     *
     * @return the value of t_contract_extend.id
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.id
     *
     * @param id the value for t_contract_extend.id
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.gmt_created
     *
     * @return the value of t_contract_extend.gmt_created
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.gmt_created
     *
     * @param gmtCreated the value for t_contract_extend.gmt_created
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.gmt_modified
     *
     * @return the value of t_contract_extend.gmt_modified
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.gmt_modified
     *
     * @param gmtModified the value for t_contract_extend.gmt_modified
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.user_created
     *
     * @return the value of t_contract_extend.user_created
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Long getUserCreated() {
        return userCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.user_created
     *
     * @param userCreated the value for t_contract_extend.user_created
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setUserCreated(Long userCreated) {
        this.userCreated = userCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.user_modified
     *
     * @return the value of t_contract_extend.user_modified
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Long getUserModified() {
        return userModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.user_modified
     *
     * @param userModified the value for t_contract_extend.user_modified
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setUserModified(Long userModified) {
        this.userModified = userModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.alive_flag
     *
     * @return the value of t_contract_extend.alive_flag
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Integer getAliveFlag() {
        return aliveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.alive_flag
     *
     * @param aliveFlag the value for t_contract_extend.alive_flag
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setAliveFlag(Integer aliveFlag) {
        this.aliveFlag = aliveFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.version
     *
     * @return the value of t_contract_extend.version
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.version
     *
     * @param version the value for t_contract_extend.version
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.ref_contract_id
     *
     * @return the value of t_contract_extend.ref_contract_id
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public Long getRefContractId() {
        return refContractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.ref_contract_id
     *
     * @param refContractId the value for t_contract_extend.ref_contract_id
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setRefContractId(Long refContractId) {
        this.refContractId = refContractId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.contract_no
     *
     * @return the value of t_contract_extend.contract_no
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.contract_no
     *
     * @param contractNo the value for t_contract_extend.contract_no
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.contract_date
     *
     * @return the value of t_contract_extend.contract_date
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public String getContractDate() {
        return contractDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.contract_date
     *
     * @param contractDate the value for t_contract_extend.contract_date
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setContractDate(String contractDate) {
        this.contractDate = contractDate == null ? null : contractDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.settle_num
     *
     * @return the value of t_contract_extend.settle_num
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public BigDecimal getSettleNum() {
        return settleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.settle_num
     *
     * @param settleNum the value for t_contract_extend.settle_num
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setSettleNum(BigDecimal settleNum) {
        this.settleNum = settleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.settle_amt
     *
     * @return the value of t_contract_extend.settle_amt
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public BigDecimal getSettleAmt() {
        return settleAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.settle_amt
     *
     * @param settleAmt the value for t_contract_extend.settle_amt
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setSettleAmt(BigDecimal settleAmt) {
        this.settleAmt = settleAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.temp_invoice
     *
     * @return the value of t_contract_extend.temp_invoice
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public String getTempInvoice() {
        return tempInvoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.temp_invoice
     *
     * @param tempInvoice the value for t_contract_extend.temp_invoice
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setTempInvoice(String tempInvoice) {
        this.tempInvoice = tempInvoice == null ? null : tempInvoice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.settle_invoice
     *
     * @return the value of t_contract_extend.settle_invoice
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public String getSettleInvoice() {
        return settleInvoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.settle_invoice
     *
     * @param settleInvoice the value for t_contract_extend.settle_invoice
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setSettleInvoice(String settleInvoice) {
        this.settleInvoice = settleInvoice == null ? null : settleInvoice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.attr11
     *
     * @return the value of t_contract_extend.attr11
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public BigDecimal getAttr11() {
        return attr11;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.attr11
     *
     * @param attr11 the value for t_contract_extend.attr11
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setAttr11(BigDecimal attr11) {
        this.attr11 = attr11;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.attr12
     *
     * @return the value of t_contract_extend.attr12
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public BigDecimal getAttr12() {
        return attr12;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.attr12
     *
     * @param attr12 the value for t_contract_extend.attr12
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setAttr12(BigDecimal attr12) {
        this.attr12 = attr12;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.attr21
     *
     * @return the value of t_contract_extend.attr21
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public String getAttr21() {
        return attr21;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.attr21
     *
     * @param attr21 the value for t_contract_extend.attr21
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setAttr21(String attr21) {
        this.attr21 = attr21 == null ? null : attr21.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_contract_extend.attr22
     *
     * @return the value of t_contract_extend.attr22
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public String getAttr22() {
        return attr22;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_contract_extend.attr22
     *
     * @param attr22 the value for t_contract_extend.attr22
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    public void setAttr22(String attr22) {
        this.attr22 = attr22 == null ? null : attr22.trim();
    }
}