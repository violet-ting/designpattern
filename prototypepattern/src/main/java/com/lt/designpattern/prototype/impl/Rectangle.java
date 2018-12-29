package com.lt.designpattern.prototype.impl;

import com.lt.designpattern.prototype.abs.Shape;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Rectangle
 * @description
 * @date 2018/12/26
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
