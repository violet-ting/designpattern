package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.Packing;

/**
 * Packing 接口的实体类
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Bottle
 * @description
 * @date 2018/12/26
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
