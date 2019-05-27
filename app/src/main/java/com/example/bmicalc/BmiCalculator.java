package com.example.bmicalc;

public class BmiCalculator implements Calculator {
    private String result;
    public String calculate(float weight, float height) {
        float bmi = (float) (weight / Math.pow(height / 100.0, 2.0));
        if (bmi >= 35)
            result = "고도 비만";
        else if (bmi >= 30)
            result = "2단계 비만";
        else if (bmi >= 25)
            result = "1단계 비만";
        else if (bmi >= 23)
            result = "과체중";
        else if (bmi >= 18.5)
            result = "정상";
        else result = "저체중";
        return result;
    }
}
