package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.abs.ColdDrink;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Pepsi
 * @description
 * @date 2018/12/26
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
