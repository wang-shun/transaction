package com.sinochem.crude.trade.info.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.sinochem.crude.trade.common.SimplePageInfo;
import com.sinochem.crude.trade.info.dao.ShipPointMapper;
import com.sinochem.crude.trade.info.domain.ShipPoint;
import com.sinochem.it.b2b.common.exception.BizException; 

public interface ShipPointService {
	
	public abstract ShipPointMapper getMapper(); 
	
	/**
	 * 新增
	 */
	int insertRecord(ShipPoint shipPoint);
	
	/**
	 * 根据主键物理删除, 慎用！！！
	 */
	public int deleteById(Long id) throws BizException;
	
	 /**
     * 根据条件-物理删除对象执行delete语句, 慎用！！！
     */
    public int deleteRecords(ShipPoint  record);
	
	/**
	 * 根据主键-修改对象
	 */
	int updateRecordById(ShipPoint shipPoint) throws BizException;
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	int updateRecords(Map<String, Object> map);
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	int updateRecords(ShipPoint shipPoint);
	
	
	/**
	 * 根据主键-查询对象
	 */
	ShipPoint findByPrimaryKey(Long id);

	/**
	 * 根据uuid查询对象
	 */
	ShipPoint findByUuid(String uuid);
 
	
	/**
	 * 根据对象-查询对象列表
	 */
	List<ShipPoint> queryByEntitys(ShipPoint shipPoint);
		
	/**
	 * 根据条件-查询全部
	 */
	List<Map<String, Object>> queryRecords(Map<String, Object> map);
	
	/**
	 * 根据条件-分页查询
	 */
	Page<Map<String, Object>> queryRecords(Map<String, Object> map, SimplePageInfo pageInfo);
	
	/**
	 * 根据条件-查询记录条数
	 */
	int countRecords(Map<String, Object> map); 
	
	

	//**************************以下方法为开发者补充*********************************/
	
	/**
	 * 获取最新的一条记录
	 * @return
	 */
	ShipPoint getLatest(String diliveryRegion);
	
	/**
	 * 新增数据，处理最新标志字段
	 * @param agio
	 * @return
	 * @throws Exception
	 */
	int insertShipPoint(ShipPoint shipPoint) throws Exception;
	
	
	List<Map<String,Object>> queryDilveryRegion(Date endDate);
	
	List<Map<String,Object>> queryPointYear(Map<String,Object> map);
	
	List<Map<String,Object>> queryEndDate(String paramDateStr);
}
