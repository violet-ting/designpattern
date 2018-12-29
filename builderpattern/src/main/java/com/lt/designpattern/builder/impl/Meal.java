package com.lt.designpattern.builder.impl;

import com.lt.designpattern.builder.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name Meal
 * @description
 * @date 2018/12/26
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
