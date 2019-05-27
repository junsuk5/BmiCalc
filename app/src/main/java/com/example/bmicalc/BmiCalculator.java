package com.example.bmicalc;

public class BmiCalculator implements Calculator {

    /**
     * Bmi 값을 얻는다
     * @param weight 몸무게 (kg)
     * @param height 키 (cm)
     * @return Bmi
     */
    public float calculate(float weight, float height) {
        return  (float) (weight / Math.pow(height / 100.0, 2.0));
    }
}
