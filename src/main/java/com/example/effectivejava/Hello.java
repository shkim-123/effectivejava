package com.example.effectivejava;

import com.example.effectivejava.ch02.*;

import static com.example.effectivejava.ch02.NyPizza.Size.*;
import static com.example.effectivejava.ch02.Pizza.Topping.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");

        C1_NutritionFacts cocaCola = new C1_NutritionFacts(240, 8, 100, 0, 35, 27);

        C2_NutritionFacts cocaCola2 = new C2_NutritionFacts();
        cocaCola2.setServingSize(240);
        cocaCola2.setServings(8);
        cocaCola2.setCalories(199);
        cocaCola2.setSodium(35);
        cocaCola2.setCarbohydrate(27);

        C3_NutritionFacts cocaCola3 = new C3_NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
    }
}
