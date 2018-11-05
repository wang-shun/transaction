package com.sinochem.crude.trade.wechat.domain;


import java.util.Date;

public class WechatSendmsgLogs {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.id
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.memberid
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private Long memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.openid
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.receivetime
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private Date receivetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.content
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.status
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.failnum
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private Integer failnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.failmsg
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private String failmsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.failcode
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private String failcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_sendmsg_logs.sendtime
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    private Date sendtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.id
     *
     * @return the value of wechat_sendmsg_logs.id
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.id
     *
     * @param id the value for wechat_sendmsg_logs.id
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.memberid
     *
     * @return the value of wechat_sendmsg_logs.memberid
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public Long getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.memberid
     *
     * @param memberid the value for wechat_sendmsg_logs.memberid
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.openid
     *
     * @return the value of wechat_sendmsg_logs.openid
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.openid
     *
     * @param openid the value for wechat_sendmsg_logs.openid
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.receivetime
     *
     * @return the value of wechat_sendmsg_logs.receivetime
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public Date getReceivetime() {
        return receivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.receivetime
     *
     * @param receivetime the value for wechat_sendmsg_logs.receivetime
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.content
     *
     * @return the value of wechat_sendmsg_logs.content
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.content
     *
     * @param content the value for wechat_sendmsg_logs.content
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.status
     *
     * @return the value of wechat_sendmsg_logs.status
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.status
     *
     * @param status the value for wechat_sendmsg_logs.status
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.failnum
     *
     * @return the value of wechat_sendmsg_logs.failnum
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public Integer getFailnum() {
        return failnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.failnum
     *
     * @param failnum the value for wechat_sendmsg_logs.failnum
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setFailnum(Integer failnum) {
        this.failnum = failnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.failmsg
     *
     * @return the value of wechat_sendmsg_logs.failmsg
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public String getFailmsg() {
        return failmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.failmsg
     *
     * @param failmsg the value for wechat_sendmsg_logs.failmsg
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setFailmsg(String failmsg) {
        this.failmsg = failmsg == null ? null : failmsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.failcode
     *
     * @return the value of wechat_sendmsg_logs.failcode
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public String getFailcode() {
        return failcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.failcode
     *
     * @param failcode the value for wechat_sendmsg_logs.failcode
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setFailcode(String failcode) {
        this.failcode = failcode == null ? null : failcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_sendmsg_logs.sendtime
     *
     * @return the value of wechat_sendmsg_logs.sendtime
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_sendmsg_logs.sendtime
     *
     * @param sendtime the value for wechat_sendmsg_logs.sendtime
     *
     * @mbggenerated Sat Apr 14 09:43:47 CST 2018
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}