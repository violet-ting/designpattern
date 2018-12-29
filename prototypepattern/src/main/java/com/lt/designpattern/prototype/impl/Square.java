package com.lt.designpattern.prototype.impl;

import com.lt.designpattern.prototype.abs.Shape;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Square
 * @description
 * @date 2018/12/26
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
