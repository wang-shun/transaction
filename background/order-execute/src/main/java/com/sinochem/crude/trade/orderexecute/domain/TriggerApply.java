package com.sinochem.crude.trade.orderexecute.domain;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class TriggerApply implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**ID*/
	private Long id;  
	
	/**UUID*/
	private String uuid;  
	
	/**订单ID*/
	private Long orderId;  
	
	/**合约ID*/
	private Long contractId;  
	
	/**申请时间*/
	private java.util.Date applyTime;  
	
	/**合约名称*/
	private String name;  
	
	/**月份*/
	private String month;  
	
	/**申请数量*/
	private java.math.BigDecimal applyQuantity;  
	
	/**申请价格*/
	private java.math.BigDecimal applyPrice;  
	
	/***/
	private java.util.Date endTime;  
	
	/**锁价时间*/
	private java.util.Date lockTime;  
	
	/**锁价数量*/
	private java.math.BigDecimal lockQuantity;  
	
	/**锁价价格*/
	private java.math.BigDecimal lockPrice;  
	
	/**锁价手续费*/
	private java.math.BigDecimal lockFee;  
	
	/**锁价手续费总金额*/
	private java.math.BigDecimal lockAmount;  
	
	/**月差额*/
	private java.math.BigDecimal differAmount;  
	
	/**月差额描述*/
	private String differDesc;  
	
	/**状态*/
	private String status;  
	
	/**语言类型*/
	private String langVer;  
	
	/**当前有效状态*/
	private String aliveFlag;  
	
	/**创建人*/
	private Long createUser;  
	
	/**创建时间*/
	private java.util.Date createDate;  
	
	/**修改人*/
	private Long updateUser;  
	
	/**修改时间*/
	private java.util.Date updateDate;  
	
	/**版本号*/
	private Integer version;  
	
		/**ID*/
	public void setId(Long id){
		this.id=id;
	}
	/**ID*/
	public Long getId(){
		return this.id;
	}
	
	/**UUID*/
	public void setUuid(String uuid){
		this.uuid=uuid;
	}
	/**UUID*/
	public String getUuid(){
		return this.uuid;
	}
	
	/**订单ID*/
	public void setOrderId(Long orderId){
		this.orderId=orderId;
	}
	/**订单ID*/
	public Long getOrderId(){
		return this.orderId;
	}
	
	/**合约ID*/
	public void setContractId(Long contractId){
		this.contractId=contractId;
	}
	/**合约ID*/
	public Long getContractId(){
		return this.contractId;
	}
	
	/**申请时间*/
	public void setApplyTime(java.util.Date applyTime){
		this.applyTime=applyTime;
	}
	/**申请时间*/
	public java.util.Date getApplyTime(){
		return this.applyTime;
	}
	
	/**合约名称*/
	public void setName(String name){
		this.name=name;
	}
	/**合约名称*/
	public String getName(){
		return this.name;
	}
	
	/**月份*/
	public void setMonth(String month){
		this.month=month;
	}
	/**月份*/
	public String getMonth(){
		return this.month;
	}
	
	/**申请数量*/
	public void setApplyQuantity(java.math.BigDecimal applyQuantity){
		this.applyQuantity=applyQuantity;
	}
	/**申请数量*/
	public java.math.BigDecimal getApplyQuantity(){
		return this.applyQuantity;
	}
	
	/**申请价格*/
	public void setApplyPrice(java.math.BigDecimal applyPrice){
		this.applyPrice=applyPrice;
	}
	/**申请价格*/
	public java.math.BigDecimal getApplyPrice(){
		return this.applyPrice;
	}
	
	/***/
	public void setEndTime(java.util.Date endTime){
		this.endTime=endTime;
	}
	/***/
	public java.util.Date getEndTime(){
		return this.endTime;
	}
	
	/**锁价时间*/
	public void setLockTime(java.util.Date lockTime){
		this.lockTime=lockTime;
	}
	/**锁价时间*/
	public java.util.Date getLockTime(){
		return this.lockTime;
	}
	
	/**锁价数量*/
	public void setLockQuantity(java.math.BigDecimal lockQuantity){
		this.lockQuantity=lockQuantity;
	}
	/**锁价数量*/
	public java.math.BigDecimal getLockQuantity(){
		return this.lockQuantity;
	}
	
	/**锁价价格*/
	public void setLockPrice(java.math.BigDecimal lockPrice){
		this.lockPrice=lockPrice;
	}
	/**锁价价格*/
	public java.math.BigDecimal getLockPrice(){
		return this.lockPrice;
	}
	
	/**锁价手续费*/
	public void setLockFee(java.math.BigDecimal lockFee){
		this.lockFee=lockFee;
	}
	/**锁价手续费*/
	public java.math.BigDecimal getLockFee(){
		return this.lockFee;
	}
	
	/**锁价手续费总金额*/
	public void setLockAmount(java.math.BigDecimal lockAmount){
		this.lockAmount=lockAmount;
	}
	/**锁价手续费总金额*/
	public java.math.BigDecimal getLockAmount(){
		return this.lockAmount;
	}
	
	/**月差额*/
	public void setDifferAmount(java.math.BigDecimal differAmount){
		this.differAmount=differAmount;
	}
	/**月差额*/
	public java.math.BigDecimal getDifferAmount(){
		return this.differAmount;
	}
	
	/**月差额描述*/
	public void setDifferDesc(String differDesc){
		this.differDesc=differDesc;
	}
	/**月差额描述*/
	public String getDifferDesc(){
		return this.differDesc;
	}
	
	/**状态*/
	public void setStatus(String status){
		this.status=status;
	}
	/**状态*/
	public String getStatus(){
		return this.status;
	}
	
	/**语言类型*/
	public void setLangVer(String langVer){
		this.langVer=langVer;
	}
	/**语言类型*/
	public String getLangVer(){
		return this.langVer;
	}
	
	/**当前有效状态*/
	public void setAliveFlag(String aliveFlag){
		this.aliveFlag=aliveFlag;
	}
	/**当前有效状态*/
	public String getAliveFlag(){
		return this.aliveFlag;
	}
	
	/**创建人*/
	public void setCreateUser(Long createUser){
		this.createUser=createUser;
	}
	/**创建人*/
	public Long getCreateUser(){
		return this.createUser;
	}
	
	/**创建时间*/
	public void setCreateDate(java.util.Date createDate){
		this.createDate=createDate;
	}
	/**创建时间*/
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	
	/**修改人*/
	public void setUpdateUser(Long updateUser){
		this.updateUser=updateUser;
	}
	/**修改人*/
	public Long getUpdateUser(){
		return this.updateUser;
	}
	
	/**修改时间*/
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate=updateDate;
	}
	/**修改时间*/
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
	/**版本号*/
	public void setVersion(Integer version){
		this.version=version;
	}
	/**版本号*/
	public Integer getVersion(){
		return this.version;
	}
	
		
	
	public Map<String, Object> toMap() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id",this.id);
	map.put("uuid",this.uuid);
	map.put("orderId",this.orderId);
	map.put("contractId",this.contractId);
	map.put("applyTime",this.applyTime);
	map.put("name",this.name);
	map.put("month",this.month);
	map.put("applyQuantity",this.applyQuantity);
	map.put("applyPrice",this.applyPrice);
	map.put("endTime",this.endTime);
	map.put("lockTime",this.lockTime);
	map.put("lockQuantity",this.lockQuantity);
	map.put("lockPrice",this.lockPrice);
	map.put("lockFee",this.lockFee);
	map.put("lockAmount",this.lockAmount);
	map.put("differAmount",this.differAmount);
	map.put("differDesc",this.differDesc);
	map.put("status",this.status);
	map.put("langVer",this.langVer);
	map.put("aliveFlag",this.aliveFlag);
	map.put("createUser",this.createUser);
	map.put("createDate",this.createDate);
	map.put("updateUser",this.updateUser);
	map.put("updateDate",this.updateDate);
	map.put("version",this.version);
			return map;
	}
}