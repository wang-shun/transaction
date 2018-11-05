package com.sinochem.crude.trade.orderexecute.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sinochem.crude.trade.orderexecute.domain.TriggerTransfer;
//import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface TriggerTransferMapper {

	public int insertRecord(TriggerTransfer entity);
	
	public int deleteById( @Param("id") Long id);
	
	public int deleteRecords(TriggerTransfer entity);
	
	public int updateRecordById(TriggerTransfer entity);
	
	public int updateRecords(Map<String,Object> map);
	
	public TriggerTransfer findByPrimaryKey( /* @Param("id") */ Long id);	
	
	public TriggerTransfer findByUuid(String uuid);	
	
	//返回对象的List
	public List<TriggerTransfer> queryByEntitys(TriggerTransfer entity);
	
	//返回Map的List
	public List<Map<String,Object>> queryRecords(Map<String,Object> map);
	
	public int countRecords(Map<String,Object> map);

	
	//**************************以下方法为开发者补充*********************************/
	
	public int countTransferMonth(@Param("orderId") Long orderId, @Param("transferMonth")String transferMonth);
	
}