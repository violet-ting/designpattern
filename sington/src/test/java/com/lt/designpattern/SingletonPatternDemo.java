package com.lt.designpattern;

import org.junit.Test;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name SingletonPatternDemo
 * @description
 * @date 2018/12/26
 */
public class SingletonPatternDemo extends SingtonApplicationTests {
    @Test
    public void singleTest(){
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}

