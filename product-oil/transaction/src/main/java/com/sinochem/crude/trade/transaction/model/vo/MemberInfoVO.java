package com.sinochem.crude.trade.transaction.model.vo;

/**
 * 用户信息的VO
 * @author Yichen Zhao
 * date: 20180309
 */
public class MemberInfoVO {

    /**
     * 用户ID
     */
    private Long memberId;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 邮箱地址
     */
    private String email;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
