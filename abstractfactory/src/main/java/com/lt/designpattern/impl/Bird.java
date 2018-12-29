package com.lt.designpattern.impl;

import com.lt.designpattern.Animal;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Bird
 * @description
 * @date 2018/12/22
 */
public class Bird implements Animal {
    @Override
    public void eat(String type) {
        System.out.println("小鸟爱吃虫！");
    }
}
