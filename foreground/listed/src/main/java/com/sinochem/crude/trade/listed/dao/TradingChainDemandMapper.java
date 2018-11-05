package com.sinochem.crude.trade.listed.dao;


import com.sinochem.crude.trade.listed.domain.TradingChainDemand;

import java.util.List;

public interface TradingChainDemandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain_demand
     *
     * @mbggenerated Thu Apr 12 19:31:55 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain_demand
     *
     * @mbggenerated Thu Apr 12 19:31:55 CST 2018
     */
    int insert(TradingChainDemand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain_demand
     *
     * @mbggenerated Thu Apr 12 19:31:55 CST 2018
     */
    int insertSelective(TradingChainDemand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain_demand
     *
     * @mbggenerated Thu Apr 12 19:31:55 CST 2018
     */
    TradingChainDemand selectByPrimaryKey(Long id);


    TradingChainDemand selectByUuid(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain_demand
     *
     * @mbggenerated Thu Apr 12 19:31:55 CST 2018
     */
    int updateByPrimaryKeySelective(TradingChainDemand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trading_chain_demand
     *
     * @mbggenerated Thu Apr 12 19:31:55 CST 2018
     */
    int updateByPrimaryKey(TradingChainDemand record);

    List<TradingChainDemand> selectByTradingChainId(Long tradingChainId);
}