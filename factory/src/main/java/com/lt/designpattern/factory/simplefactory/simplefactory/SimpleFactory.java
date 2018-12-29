package com.lt.designpattern.factory.simplefactory.simplefactory;

import org.springframework.stereotype.Component;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name SimpleFactory
 * @description
 * @date 2018/12/23
 */
@Component
public class SimpleFactory {
    public Animal createAnimal(int type) {
        switch (type) {
            case 1:
                return new Bird();
            case 2:
                return new Panda();
            default:
                throw new RuntimeException("未定义的动物类型");
        }
    }

}
