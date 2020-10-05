package com.imooc.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class OrderForm {

    @NotEmpty(message = "name missing")
    private String name;


    @NotEmpty(message = "address missing")
    private String address;

    
    @NotEmpty(message = "openid missing")
    private String openid;

    @NotEmpty(message = "cart empty")
    private String items;
}
