package com.neuedu.business.service;

import com.neuedu.business.common.ServerResponse;

/**
 * 添加类别业务逻辑处理类
 */
public interface ICategoryService {
    /**
     * 添加类别
     */
    ServerResponse addCategory(Integer parentId,String categoryName);
    /**
     * 修改类别
     */
    ServerResponse set_category_name(Integer categoryId,String categoryName);
    /**
     * 查询平级子类别
     */
    ServerResponse get_category(Integer categoryId);
    /**
     * 递归查询子节点
     */
    ServerResponse get_deep_category(Integer categoryId);
}
