package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.abs.Burger;
import com.lt.designpattern.builder.abs.ColdDrink;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Coke
 * @description
 * @date 2018/12/26
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
