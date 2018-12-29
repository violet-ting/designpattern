package com.lt.designpattern.builder;

/**
 * 食物条目和（食物包装）的接口
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Item
 * @description
 * @date 2018/12/26
 */
public interface Item {
    /**name
     * @author ting.liu01@hand-china.com
     * @date 18:35 2018/12/26
     * @return
     */
    String name();

    /**
     * 包装
     * @author ting.liu01@hand-china.com
     * @date 18:35 2018/12/26
     * @return
     */
    Packing packing();

    /**
     * 价格
     * @author ting.liu01@hand-china.com
     * @date 18:35 2018/12/26
     * @return
     */
    float price();
}
