package com.sinochem.crude.trade.news.dao;

import java.util.List;

import com.sinochem.crude.trade.news.model.TSysCodeSet;
import com.sinochem.crude.trade.news.model.query.ProductCodeQuery;

public interface TSysCodeSetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_code_set
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_code_set
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insert(TSysCodeSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_code_set
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insertSelective(TSysCodeSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_code_set
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    TSysCodeSet selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_code_set
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKeySelective(TSysCodeSet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_code_set
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKey(TSysCodeSet record);
    
    /**
     * 根据itemName查询商品code
     * @param query
     * @return
     * 2018年3月22日
     */
    List<TSysCodeSet> selectByItemName(ProductCodeQuery query);
    
    
}