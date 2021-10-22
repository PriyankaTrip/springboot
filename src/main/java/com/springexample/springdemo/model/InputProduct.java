package com.springexample.springdemo.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class InputProduct {
    public String productId;
    public String prodName;
    public String availDate;
}
