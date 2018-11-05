package com.sinochem.crude.trade.shipping.domain.po;

import com.sinochem.crude.trade.common.utils.KeyGenUtils;

import java.util.Date;
import java.util.UUID;

/**
 * @author WGP
 * @descriptioncrude-trade-product_oil
 * @date 2018/4/11
 **/
public class BasePo {



    /**
     * 主键
     */
    protected Long id;

    /**
     * uuid
     */
    protected String uuid = KeyGenUtils.newUuid();

    /**
     * 创建时间
     */
    protected Date gmtCreated;

    /**
     * 修改时间
     */
    protected Date gmtModified;

    /**
     * 创建用户
     */
    protected Long userCreated;

    /**
     * 修改用户
     */
    protected Long userModified;

    /**
     * 现存标识 （constant/Mark），默认为存在
     */
    protected Integer aliveFlag = 1;

    /**
     * 版本，默认为0
     */
    protected Long version = 0L;

    /** getters and setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Long userCreated) {
        this.userCreated = userCreated;
    }

    public Long getUserModified() {
        return userModified;
    }

    public void setUserModified(Long userModified) {
        this.userModified = userModified;
    }

    public Integer getAliveFlag() {
        return aliveFlag;
    }

    public void setAliveFlag(Integer aliveFlag) {
        this.aliveFlag = aliveFlag;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
