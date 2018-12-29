package com.lt.designpattern.simplefactory;

import com.lt.designpattern.AbstractfactoryApplicationTests;
import com.lt.designpattern.Animal;
import com.lt.designpattern.Factory;
import com.lt.designpattern.abstractfactory.impl.AbstractFactory;
import com.lt.designpattern.factorymethod.impl.BirdFactory;
import com.lt.designpattern.factorymethod.impl.PandaFactory;
import com.lt.designpattern.simplefactory.impl.SimpleFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name simpleTest
 * @description
 * @date 2018/12/23
 */
public class simpleTest extends AbstractfactoryApplicationTests{
    @Autowired
    private SimpleFactory simpleFactory;
    @Autowired
    private AbstractFactory abstractFactory;

    @Autowired
    private BirdFactory birdFactory;
    @Autowired
    private PandaFactory pandaFactory;

    private final static String BIRD = "bird";
    private final static String PANDA = "panda";
    @Test
    public void eatingTest(){
        System.out.println("****************简单工厂开始***********************");
        simpleFactory.createAnimal(BIRD);
        simpleFactory.createAnimal(PANDA);
        System.out.println("****************简单工厂结束***********************");

    }
    @Test
    public void factoryMethodTest(){
        System.out.println("****************工厂方法开始***********************");
        birdFactory.createAnimal();
        pandaFactory.createAnimal();
        System.out.println("****************工厂方法结束***********************");
    }



    @Test
    public void abstractTest() throws Exception{
        System.out.println("****************抽象工厂开始***********************");
        Animal bird = abstractFactory.getAnimal(BIRD);
        bird.eat(BIRD);
        Animal panda = abstractFactory.getAnimal(PANDA);
        panda.eat(PANDA);
        System.out.println("****************抽象工厂开始***********************");
    }
}
