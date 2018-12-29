package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.Packing;

/**
 * Packing实现类
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Wrapper
 * @description
 * @date 2018/12/26
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
