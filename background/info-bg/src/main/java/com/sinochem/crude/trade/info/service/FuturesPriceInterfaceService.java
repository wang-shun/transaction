package com.sinochem.crude.trade.info.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.sinochem.crude.trade.common.SimplePageInfo;
import com.sinochem.crude.trade.info.dao.FuturesPriceInterfaceMapper;
import com.sinochem.crude.trade.info.domain.ExternalInteractive;
import com.sinochem.crude.trade.info.domain.FuturesPriceInterface;
import com.sinochem.it.b2b.common.exception.BizException; 

public interface FuturesPriceInterfaceService {
	
	public abstract FuturesPriceInterfaceMapper getMapper(); 
	
	/**
	 * 新增
	 */
	int insertRecord(FuturesPriceInterface futuresPriceInterface);
	
	/**
	 * 根据主键物理删除, 慎用！！！
	 */
	public int deleteById(Long id) throws BizException;
	
	 /**
     * 根据条件-物理删除对象执行delete语句, 慎用！！！
     */
    public int deleteRecords(FuturesPriceInterface  record);
	
	/**
	 * 根据主键-修改对象
	 */
	int updateRecordById(FuturesPriceInterface futuresPriceInterface) throws BizException;
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	int updateRecords(Map<String, Object> map);
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	int updateRecords(FuturesPriceInterface futuresPriceInterface);
	
	
	/**
	 * 根据主键-查询对象
	 */
	FuturesPriceInterface findByPrimaryKey(Long id);

	/**
	 * 根据uuid查询对象
	 */
	FuturesPriceInterface findByUuid(String uuid);
 
	
	/**
	 * 根据对象-查询对象列表
	 */
	List<FuturesPriceInterface> queryByEntitys(FuturesPriceInterface futuresPriceInterface);
		
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
	 * 处理原油期货价格接口数据
	 * @param ei
	 * @throws Exception
	 */
	public void processFuturesPrice(ExternalInteractive ei) throws Exception;
	
	/**
	 * 弃用(单个)
	 * @param uuid
	 * @param processPerson
	 * @throws Exception
	 */
	public void abandonByUuid(String uuid, String processPerson) throws Exception;
	
	/**
	 * 使用(单个)
	 * @param uuid
	 * @param processPerson
	 * @throws Exception
	 */
	public void useByUuid(String uuid, String processPerson) throws Exception;
	
	/**
	 * 全部弃用
	 * @param processPerson
	 * @throws Exception
	 */
	public void abandonAll(String processPerson) throws Exception;
	
	/**
	 * 全部使用
	 */
	public void useAll(String processPerson) throws Exception;
}