package com.springexample.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OutputProduct {
    public String productId;
    public String prodName;
    public Double availQty;

}
