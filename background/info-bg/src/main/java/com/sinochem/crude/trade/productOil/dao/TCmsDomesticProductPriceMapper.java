package com.sinochem.crude.trade.productOil.dao;

import com.sinochem.crude.trade.productOil.model.TCmsDomesticProductPrice;
import com.sinochem.crude.trade.productOil.model.query.ProductInfoQuery;

import java.util.List;

public interface TCmsDomesticProductPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_domestic_product_price
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_domestic_product_price
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insert(TCmsDomesticProductPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_domestic_product_price
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int insertSelective(TCmsDomesticProductPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_domestic_product_price
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    TCmsDomesticProductPrice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_domestic_product_price
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKeySelective(TCmsDomesticProductPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cms_domestic_product_price
     *
     * @mbggenerated Thu Mar 22 14:11:25 CST 2018
     */
    int updateByPrimaryKey(TCmsDomesticProductPrice record);
    
    /**
     * 根据商品code和价格时间查询商品价格信息
     * @param query
     * @return
     * 2018年3月22日
     */
    List<TCmsDomesticProductPrice> selectByProductCode(ProductInfoQuery query);
    
    
}