package com.lt.designpattern.factorymethod.impl;

import com.lt.designpattern.Animal;
import com.lt.designpattern.Factory;
import com.lt.designpattern.impl.Bird;
import com.lt.designpattern.impl.Panda;
import org.springframework.stereotype.Component;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name SimpleFactory
 * @description
 * @date 2018/12/23
 */
@Component
public class BirdFactory implements Factory {
    private final static String BIRD = "bird";

    @Override
    public void createAnimal() {
        Animal animal = new Bird();
        animal.eat(BIRD);
    }
}
