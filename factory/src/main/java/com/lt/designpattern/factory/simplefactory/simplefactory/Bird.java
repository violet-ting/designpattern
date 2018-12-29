package com.lt.designpattern.factory.simplefactory.simplefactory;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Bird
 * @description
 * @date 2018/12/22
 */
public class Bird implements Animal {

    @Override
    public String eat(String type) {
        return "小鸟爱吃虫！";
    }
}
