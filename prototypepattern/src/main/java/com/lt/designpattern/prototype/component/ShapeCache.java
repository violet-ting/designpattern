package com.lt.designpattern.prototype.component;

import com.lt.designpattern.prototype.abs.Shape;
import com.lt.designpattern.prototype.impl.Circle;
import com.lt.designpattern.prototype.impl.Rectangle;
import com.lt.designpattern.prototype.impl.Square;

import java.util.Hashtable;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name ShapeCache
 * @description
 * @date 2018/12/26
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
