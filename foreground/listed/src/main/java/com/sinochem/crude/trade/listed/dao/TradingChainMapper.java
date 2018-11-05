package com.sinochem.crude.trade.listed.dao;


import com.sinochem.crude.trade.listed.domain.TradingChain;
import com.sinochem.crude.trade.listed.model.query.TradeChainQuery;
import com.sinochem.crude.trade.listed.model.vo.tradingChainVo.EnterpriseNameByTradingChainVO;

import java.util.List;

public interface TradingChainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    Long insert(TradingChain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    Long insertSelective(TradingChain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    TradingChain selectByPrimaryKey(Long id);



    TradingChain selectByUuid(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    int updateByPrimaryKeySelective(TradingChain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain
     *
     * @mbggenerated Mon Apr 16 09:45:22 CST 2018
     */
    int updateByPrimaryKey(TradingChain record);

    /**
     * 根据查询条件混合查询
     */
    List<TradingChain> uniteSelectByQuery(TradeChainQuery tradeChainQuery);

    /**
     * 根据demandId查询贸易链
     * @param demandId
     * @return
     */
    List<TradingChain> selectByDemandId(Long demandId);

    /**
     * 根据当前登录用户查询出所有与该用户参与贸易链的企业名称
     */
    List<EnterpriseNameByTradingChainVO> selectEnterpriseNameByTradingChain(Long memberId);

}