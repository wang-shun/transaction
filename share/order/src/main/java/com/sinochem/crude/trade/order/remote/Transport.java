package com.sinochem.crude.trade.order.remote;

import java.io.Serializable;
import java.util.Date;

public class Transport implements Serializable {
    private Long id;

    /**
     * 运输方式
     */
    private Integer transportModes;

    /**
     * 需求id
     */
    private Long demandId;

    /**
     * 卸货港
     */
    private String dischargePort;

    /**
     * 装货港
     */
    private String shipmentPort;


    /**
     * 装货开始时间
     */
    private Date shipmentStartTime;

    /**
     * 装货结束时间
     */
    private Date shipmentEndTime;

    /**
     * 到货开始时间
     */
    private Date dischargeStartTime;

    /**
     * 到货结束时间
     */
    private Date dischargeEndTime;

    /**
     * 船型
     */
    private Integer shipType;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private Long updater;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTransportModes() {
        return transportModes;
    }

    public void setTransportModes(Integer transportModes) {
        this.transportModes = transportModes;
    }

    public Long getDemandId() {
        return demandId;
    }

    public void setDemandId(Long demandId) {
        this.demandId = demandId;
    }

    public String getDischargePort() {
        return dischargePort;
    }

    public void setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
    }

    public String getShipmentPort() {
        return shipmentPort;
    }

    public void setShipmentPort(String shipmentPort) {
        this.shipmentPort = shipmentPort;
    }

    public Date getShipmentStartTime() {
        return shipmentStartTime;
    }

    public void setShipmentStartTime(Date shipmentStartTime) {
        this.shipmentStartTime = shipmentStartTime;
    }

    public Date getShipmentEndTime() {
        return shipmentEndTime;
    }

    public void setShipmentEndTime(Date shipmentEndTime) {
        this.shipmentEndTime = shipmentEndTime;
    }

    public Date getDischargeStartTime() {
        return dischargeStartTime;
    }

    public void setDischargeStartTime(Date dischargeStartTime) {
        this.dischargeStartTime = dischargeStartTime;
    }

    public Date getDischargeEndTime() {
        return dischargeEndTime;
    }

    public void setDischargeEndTime(Date dischargeEndTime) {
        this.dischargeEndTime = dischargeEndTime;
    }

    public Integer getShipType() {
        return shipType;
    }

    public void setShipType(Integer shipType) {
        this.shipType = shipType;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}