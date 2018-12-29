package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.abs.Burger;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name ChickenBurger
 * @description
 * @date 2018/12/26
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 55.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
