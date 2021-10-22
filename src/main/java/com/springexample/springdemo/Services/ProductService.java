package com.springexample.springdemo.Services;

import com.springexample.springdemo.model.InputProduct;
import com.springexample.springdemo.model.Product;

import java.util.List;

/***
 * Interface of product class for getting Inventory details
 * as Product Id, Name, UOM, Available Quantity, Available Date
 */
public interface ProductService {

    public Double getInventoryPicture(InputProduct inputProduct);

    public List<Product> getProduct();



}
