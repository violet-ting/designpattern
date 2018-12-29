package com.lt.designpattern.builder;

import com.lt.designpattern.builder.component.MealBuilder;
import com.lt.designpattern.builder.impl.Meal;
import org.junit.Test;

/**
 * @author ting.liu01@hand-china.com
 * @version 1.0
 * @name BuilderPatternDemo
 * @description
 * @date 2018/12/26
 */
public class BuilderPatternDemo extends BuilderpatternApplicationTests {
    @Test
    public void bulidTest(){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
