package com.sinochem.crude.trade.info.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
//import com.runyi.ryplat.api.commons.SimplePageInfo;
import com.sinochem.crude.trade.common.SimplePageInfo;
import com.sinochem.crude.trade.common.exception.BizException;
import com.sinochem.crude.trade.info.dao.InfoTimingMapper;
import com.sinochem.crude.trade.info.domain.InfoTiming; 

public interface InfoTimingService {
	
	public abstract InfoTimingMapper getMapper(); 
	
	/**
	 * 新增
	 */
	int insertRecord(InfoTiming infoTiming);
	
	/**
	 * 根据主键物理删除, 慎用！！！
	 */
	public int deleteById(Long id) throws BizException;
	
	 /**
     * 根据条件-物理删除对象执行delete语句, 慎用！！！
     */
    public int deleteRecords(InfoTiming  record);
	
	/**
	 * 根据主键-修改对象
	 */
	int updateRecordById(InfoTiming infoTiming) throws BizException;
	
	/**
	 * 根据uuid-修改对象
	 */
	int updateRecordByUuid(InfoTiming infoTiming) throws BizException;
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	int updateRecords(Map<String, Object> map);
	
	/**
	 * 根据条件-批量修改数据(危险慎用)
	 */
	int updateRecords(InfoTiming infoTiming);
	
	
	/**
	 * 根据主键-查询对象
	 */
	InfoTiming findByPrimaryKey(Long id);

	/**
	 * 根据uuid查询对象
	 */
	InfoTiming findByUuid(String uuid);
 
	
	/**
	 * 根据对象-查询对象列表
	 */
	List<InfoTiming> queryByEntitys(InfoTiming infoTiming);
		
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
	 * 设置定时发布
	 * @param uuid
	 * @param time
	 * @return
	 */
	public boolean insertTimingInfo(InfoTiming it); 
	
	/**
	 * 待处理
	 */
	public List<InfoTiming> getTimingList(Long second);
	
	/**
	 * 已处理
	 */
	public boolean processedInfoTiming(Long id);
}
