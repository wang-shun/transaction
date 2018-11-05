package com.sinochem.crude.trade.member.domain;

import java.util.Date;

public class EnterpriseLog {
    /**
     * 企业编号
     */
    private Long id;

    private Long enterpriseId;

    /**
     * 企业UUID
     */
    private String code;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 全名
     */
    private String fullName;

    /**
     * 英文名
     */
    private String englishName;

    /**
     * 组织机构证号
     */
    private String organizationCode;

    /**
     * 税号
     */
    private String taxCode;

    /**
     * 工商执照证件号码
     */
    private String licenseNo;

    /**
     * 税务登记证件
     */
    private String taxNo;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 删除标记
     */
    private String delFlg;

    /**
     * 组织机构代码图片ID
     */
    private String orgCodeCert;

    /**
     * 税务登记证件图片ID
     */
    private String taxRegCert;

    /**
     * 营业执照图片ID
     */
    private String businessLicenseCert;
    /**
     * 社会信用证代码证图片ID
     */
    private String socialCreditCert;

    /**
     * 企业logo图片ID
     */
    private String epLogo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新用户
     */
    private String updateUser;

    /**
     * 描述
     */
    private String description;

    /**
     * members表关联ID
     */
    private Long memberId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg;
    }

    public String getOrgCodeCert() {
        return orgCodeCert;
    }

    public void setOrgCodeCert(String orgCodeCert) {
        this.orgCodeCert = orgCodeCert;
    }

    public String getTaxRegCert() {
        return taxRegCert;
    }

    public void setTaxRegCert(String taxRegCert) {
        this.taxRegCert = taxRegCert;
    }

    public String getBusinessLicenseCert() {
        return businessLicenseCert;
    }

    public void setBusinessLicenseCert(String businessLicenseCert) {
        this.businessLicenseCert = businessLicenseCert;
    }

    public String getSocialCreditCert() {
        return socialCreditCert;
    }

    public void setSocialCreditCert(String socialCreditCert) {
        this.socialCreditCert = socialCreditCert;
    }

    public String getEpLogo() {
        return epLogo;
    }

    public void setEpLogo(String epLogo) {
        this.epLogo = epLogo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }


}