package com.example.effectivejava.ch02.item2;

public class C2_NutritionFacts {
    // 매개변수들은 (기본값이 있다면) 기본값으로 초기화된다
    private int servingSize = -1;       // 필수; 기본값 없음
    private int servings = -1;          // 필수; 기본값 없음
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public C2_NutritionFacts() {}

    // 세터 메서드들
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }
}
