package com.whatdy.mapper;

import com.whatdy.model.Products;
import java.util.List;

public interface ProductsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated
     */
    int insert(Products record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated
     */
    Products selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated
     */
    List<Products> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table products
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Products record);
}