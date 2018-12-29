package com.lt.designpattern.prototype.abs;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Shape
 * @description
 * @date 2018/12/26
 */
public class Shape implements Cloneable {
    private String id;
    protected String type;

    public void draw(){}

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
