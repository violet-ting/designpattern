package com.lt.designpattern.impl;

import com.lt.designpattern.Animal;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Panda
 * @description
 * @date 2018/12/22
 */
public class Panda implements Animal {
    @Override
    public void eat(String type) {
        System.out.println("熊猫吃竹子！");
    }
}
