package com.sinochem.crude.trade.productOil.dao;

import com.sinochem.crude.trade.productOil.model.TCmsChannelM;

public interface TCmsChannelMMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_channel_m
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_channel_m
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insert(TCmsChannelM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_channel_m
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insertSelective(TCmsChannelM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_channel_m
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    TCmsChannelM selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_channel_m
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKeySelective(TCmsChannelM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_channel_m
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKey(TCmsChannelM record);
}