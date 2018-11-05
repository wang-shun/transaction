package com.sinochem.crude.trade.productOil.dao;

import com.sinochem.crude.trade.productOil.model.TCmsInfo;
import com.sinochem.crude.trade.productOil.model.query.InfoQuery;

public interface TCmsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insert(TCmsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insertSelective(TCmsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    TCmsInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKeySelective(TCmsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TCmsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_info
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKey(TCmsInfo record);
    
    /**
     * 根据标题、分类Id和语言进行查询
     * @param query
     * @return
     * 2018年3月23日
     */
    TCmsInfo selectByChannelTitle(InfoQuery query);
    
}