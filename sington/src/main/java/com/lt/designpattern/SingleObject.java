package com.lt.designpattern;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name SingleObject
 * @description
 * @date 2018/12/26
 */
public class SingleObject {
    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject(){}

    /**
     * 获取唯一可用的对象
     * @return
     */
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("HAPPY NEW YEAR!");
    }
}


enum Singleton {
    INSTANCE;
    public void whateverMethod() {
    }
}
