package com.companyname.springapp2.repository;

import java.util.List;

import com.companyname.springapp2.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}