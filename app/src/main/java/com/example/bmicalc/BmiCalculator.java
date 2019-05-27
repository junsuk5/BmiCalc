package com.example.bmicalc;

public class BmiCalculator implements Calculator {

    /**
     * Bmi 값을 얻는다
     *
     * @param height 키 (cm)
     * @param weight 몸무게 (kg)
     * @return Bmi
     */
    public float calculate(float height, float weight) {
        return (float) (weight / Math.pow(height / 100.0, 2.0));
    }
}
