package com.springexample.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@AllArgsConstructor
@Data
public class Product {
    public String productId;
    public String prodName;
    public String UOM;
    public Double availQty;
    public String availDate;

}

