package com.lt.designpattern.simplefactory.impl;

import com.lt.designpattern.Animal;
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
public class SimpleFactory {
    private final static String BIRD = "bird";
    private final static String PANDA = "panda";

    public void createAnimal(String type) {
        Animal animal = new Animal() {
            @Override
            public void eat(String type) {
                System.out.println("都要补充能量！");
            }
        };
        if (BIRD.equals(type)){
            animal = new Bird();
        }else if(PANDA.equals(type)){
            animal = new Panda();
        }
        animal.eat(type);
    }
}
