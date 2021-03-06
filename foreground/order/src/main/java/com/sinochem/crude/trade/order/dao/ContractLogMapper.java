package com.sinochem.crude.trade.order.dao;

import com.sinochem.crude.trade.order.domain.ContractLog;

import java.util.List;

public interface ContractLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_log
     *
     * @mbggenerated Wed Feb 28 21:02:27 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_log
     *
     * @mbggenerated Wed Feb 28 21:02:27 CST 2018
     */
    int insert(ContractLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_log
     *
     * @mbggenerated Wed Feb 28 21:02:27 CST 2018
     */
    int insertSelective(ContractLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_log
     *
     * @mbggenerated Wed Feb 28 21:02:27 CST 2018
     */
    ContractLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_log
     *
     * @mbggenerated Wed Feb 28 21:02:27 CST 2018
     */
    int updateByPrimaryKeySelective(ContractLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_log
     *
     * @mbggenerated Wed Feb 28 21:02:27 CST 2018
     */
    int updateByPrimaryKey(ContractLog record);

    List<ContractLog> selectByContractId(Long contractId);
}