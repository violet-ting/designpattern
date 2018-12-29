package com.lt.designpattern.factory.simplefactory.simplefactory;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Factory
 * @description
 * @date 2018/12/23
 */
public interface Factory {
    /**
     * 工厂方法接口
     * @author ting.liu01@hand-china.com
     * @date 10:51 2018/12/23
     * @param type
     * @return
     */
    Animal createAnimal(int type);
}
