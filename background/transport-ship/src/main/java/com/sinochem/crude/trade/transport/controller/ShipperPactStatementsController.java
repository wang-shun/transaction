package com.sinochem.crude.trade.transport.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.github.pagehelper.Page;
import com.sinochem.crude.trade.common.SimplePageInfo;
import com.sinochem.crude.trade.common.exception.BizException;
import com.sinochem.crude.trade.common.result.ResultDatas;
import com.sinochem.crude.trade.common.utils.BeanConvertUtils;
import com.sinochem.crude.trade.member.user.CurrentUser;
import com.sinochem.crude.trade.transport.URLMapping;
import com.sinochem.crude.trade.transport.commons.constants.Constants;
import com.sinochem.crude.trade.transport.commons.exceptions.TransportException;
import com.sinochem.crude.trade.transport.domain.PactStatements;
import com.sinochem.crude.trade.transport.model.PactStatementsVO;
import com.sinochem.crude.trade.transport.query.StatementsQuery;
import com.sinochem.crude.trade.transport.service.PactStatementsService;
import com.sinochem.it.b2b.member.access.RolesAccess;


/**
 * @ClassName: Controller
 * @Description: 结算单（租船合同）货主
 * @author jiangxiuqiang
 * @date 2018年3月2日
 * @version V1.0
 */
@Controller
public class ShipperPactStatementsController  {
	@Autowired
	private PactStatementsService pactStatementsService;
	
	Log log = LogFactory.getLog(ShipperPactStatementsController.class);
	
	/**
	 * 结算单(租船合同)
	 */
	@RolesAccess({Constants.SALES_TRADER,Constants.BUY_TRADER,Constants.TRADE_EXECUTOR,Constants.CHARTERER})
	@RequestMapping(value=URLMapping.SHIPPER_PACT_STATEMENT_LIST)
	public void findStatementsPact(CurrentUser user, ModelMap modelMap, StatementsQuery query){
		//校验用户
		if(user == null){
			throw new TransportException(TransportException.TYPE.ITSH001);
		}
		if(user.getEpMemberId() == null){
			throw new TransportException(TransportException.TYPE.ITSH535);
		}
		
		//查询的参数
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("receiptCode", query.getReceiptCode());
		map.put("pactCode", query.getPactCode());
		map.put("epMemberId", user.getEpMemberId());
				
		//分页设定
		SimplePageInfo pageInfo = new  SimplePageInfo();
		pageInfo.setPageNum(query.getCurrentPage());
		pageInfo.setPageSize(10);
		Page<Map<String, Object>> pages = pactStatementsService.queryRecords(map, pageInfo);
		query.setTotalItem(Long.valueOf(pages.getPages()));
		
		modelMap.put("query", query);
		modelMap.put("datas", pages);
		modelMap.put("user", user);
	}
	
	
	/**
	 * 根据uuid查看单条合同结算数据
	 */
	@ResponseBody
	@RolesAccess({Constants.SALES_TRADER,Constants.BUY_TRADER,Constants.TRADE_EXECUTOR,Constants.CHARTERER})
	@RequestMapping(value=URLMapping.SHIPPER_PACT_STATEMENT_FINDBYUUID, method = RequestMethod.POST  )
	public ResultDatas<PactStatementsVO> findPactStatementsByUuid(String uuid, CurrentUser user){
		ResultDatas<PactStatementsVO> res = new ResultDatas<>();
		PactStatementsVO vo = new PactStatementsVO();
		if(StringUtils.isNotEmpty(uuid)){
			vo.setUuid(uuid);
		}
		try{
			//校验用户
			if(user == null){
				throw new TransportException(TransportException.TYPE.ITSH001);
			}
			if(user.getEpMemberId() == null){
				throw new TransportException(TransportException.TYPE.ITSH535);
			}
			if(StringUtils.isEmpty(vo.getUuid())){
				throw new TransportException(TransportException.TYPE.ITSH352);
			}
			PactStatements ps = pactStatementsService.findByUuid(vo.getUuid());
			if (ps != null) {
				PactStatementsVO datas = BeanConvertUtils.beanToBean(ps, PactStatementsVO.class);
				res.setDatas(datas);
			}
		} catch (BizException e) {
			log.error("findPactStatementsByUuid error", e);
			res.setStatus(Constants.EXCEPTION_STATUS);
			res.setCode(e.getCode());
			res.setMessage(e.getCode());
		} catch (Exception e) {
			log.error("findPactStatementsByUuid error", e);
			res.setStatus(Constants.EXCEPTION_STATUS);
			res.setCode(Constants.EXCEPTION_CODE);
			res.setMessage(Constants.EXCEPTION_CODE);
		}
		return res;
	}
}
