package com.lt.designpattern.prototype;

import com.lt.designpattern.prototype.abs.Shape;
import com.lt.designpattern.prototype.component.ShapeCache;
import org.junit.Test;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name PrototypePatternDemo
 * @description
 * @date 2018/12/26
 */
public class PrototypePatternDemo extends PrototypepatternApplicationTests {
    @Test
    public void prototypeTest(){
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
