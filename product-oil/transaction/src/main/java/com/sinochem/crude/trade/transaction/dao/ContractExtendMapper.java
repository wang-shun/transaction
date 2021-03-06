package com.sinochem.crude.trade.transaction.dao;

import com.sinochem.crude.trade.transaction.domain.po.ContractExtend;

public interface ContractExtendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_extend
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_extend
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    int insert(ContractExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_extend
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    int insertSelective(ContractExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_extend
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    ContractExtend selectByPrimaryKey(Long id);

    ContractExtend selectByContractId(Long contractId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_extend
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    int updateByPrimaryKeySelective(ContractExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_contract_extend
     *
     * @mbggenerated Thu Jul 12 15:22:28 CST 2018
     */
    int updateByPrimaryKey(ContractExtend record);
}