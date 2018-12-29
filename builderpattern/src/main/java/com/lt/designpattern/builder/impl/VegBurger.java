package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.abs.Burger;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name VegBurger
 * @description
 * @date 2018/12/26
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
