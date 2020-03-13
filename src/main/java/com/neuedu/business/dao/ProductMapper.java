package com.neuedu.business.dao;

import com.neuedu.business.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    List<Product> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Product record);

    /**
     * 更新商品信息，只更新非空字段
     * @param product
     * @return
     */
    int updateProductByActive(@Param("product") Product product);

    /**
     *
     * 按照商品名称和categoryid做检索
     * */

    List<Product>  findProducsByCategoryIdsAndkeyword(@Param("categoryIds")List<Integer> ids,
                                                      @Param("keyword")String keyword);

    /**
     * 商品扣库存接口
     * */
    int  reduceStock(@Param("productId")Integer productId,@Param("stock") Integer stock);
}