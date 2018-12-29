package com.lt.designpattern.builder.component;

import com.lt.designpattern.builder.impl.*;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name MealBuilder
 * @description
 * @date 2018/12/26
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
