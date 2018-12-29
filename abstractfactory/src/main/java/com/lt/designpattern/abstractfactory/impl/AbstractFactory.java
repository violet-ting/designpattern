package com.lt.designpattern.abstractfactory.impl;

import com.lt.designpattern.Animal;
import org.springframework.stereotype.Component;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name AbstractFactory
 * @description
 * @date 2018/12/26
 */
@Component
public class AbstractFactory {
    private final static String BIRD = "bird";
    private final static String PANDA = "panda";
    public static Animal animal = null;//静态
    //静态方法
    public static Animal getAnimal(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
        //静态工厂一般使用类的反射来构建对象
        if(type.trim().equals(BIRD)){
            animal =(Animal) Class.forName("com.lt.designpattern.impl.Bird").newInstance();
        }else if(type.trim().equals(PANDA)){
            animal=(Animal) Class.forName("com.lt.designpattern.impl.Panda").newInstance();
        }
        return animal;
    }
}
