package com.sinochem.crude.trade.inspector.domain;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * 商检报告
 * @author wdh
 * @date 2018/09/7
 */
public class TaskInfoQuery extends TaskInfo {

    //油种
    private String oilseed;
    //被委托商检企业id
    private Long enterprise_id;
    //商检任务状态
    private String status;

    @JsonUnwrapped
    private SimplePageInfo pageInfo;

    public SimplePageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(SimplePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String getOilseed() {
        return oilseed;
    }

    @Override
    public void setOilseed(String oilseed) {
        this.oilseed = oilseed;
    }

    @Override
    public Long getEnterprise_id() {
        return enterprise_id;
    }

    @Override
    public void setEnterprise_id(Long enterprise_id) {
        this.enterprise_id = enterprise_id;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}