package com.neuedu.business.dao;

import com.neuedu.business.pojo.Cart;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    List<Cart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Cart record);

    /**
     * 根据userId查询购物信息
     * */
    List<Cart> findCartByUserid(@Param("userId") Integer userId);

    /**
     * 根据userId查询已选中购物信息
     * */
    List<Cart> findCartByUseridAndChecked(@Param("userId") Integer userId);

    /**
     * 根据productId修改qualtity
     * */

    int  updateQualtityByProductId(@Param("productId")Integer productId,@Param("qualtity")Integer qualtity);

    /**
     * 统计购物车中未选中的商品数量
     * */
    int  totalCountByUnchecked(@Param("userId") Integer userId);

    /**
     * 根据用户id和商品id查询购物车中是否包含此商品
     * */
    Cart  findCartByUseridAndProductId(@Param("userId") Integer userId,
                                       @Param("productId") Integer productId);


    /**
     * 批量删除购物车信息
     * */
    int deleteBatch(@Param("cartList")List<Cart> cartList);
}