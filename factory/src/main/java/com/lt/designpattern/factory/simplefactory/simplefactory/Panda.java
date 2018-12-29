package com.lt.designpattern.factory.simplefactory.simplefactory;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Panda
 * @description
 * @date 2018/12/22
 */
public class Panda implements Animal {
    @Override
    public String eat(String type) {
        return "熊猫吃竹子！";
    }
}
