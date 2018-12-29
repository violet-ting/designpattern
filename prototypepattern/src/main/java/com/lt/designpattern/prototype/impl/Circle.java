package com.lt.designpattern.prototype.impl;

import com.lt.designpattern.prototype.abs.Shape;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Circle
 * @description
 * @date 2018/12/26
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
