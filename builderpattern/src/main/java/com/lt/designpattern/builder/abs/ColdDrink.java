package com.lt.designpattern.builder.abs;

import com.lt.designpattern.builder.Item;
import com.lt.designpattern.builder.Packing;
import com.lt.designpattern.builder.impl.Bottle;

/**
 * Packing 接口的实体类
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name ColdDrink
 * @description
 * @date 2018/12/26
 */
public abstract  class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
