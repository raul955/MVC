package com.companyname.springapp2.service;

import java.io.Serializable;
import java.util.List;

import com.companyname.springapp2.domain.Product;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();

}