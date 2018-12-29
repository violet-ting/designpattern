package com.lt.designpattern.builder.abs;

import com.lt.designpattern.builder.Item;
import com.lt.designpattern.builder.Packing;
import com.lt.designpattern.builder.impl.Wrapper;

/**
 * Packing 接口的实体类
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Burger
 * @description
 * @date 2018/12/26
 */
public abstract  class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
