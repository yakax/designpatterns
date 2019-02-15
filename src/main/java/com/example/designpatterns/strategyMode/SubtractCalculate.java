package com.example.designpatterns.strategyMode;

/**
 * @author yakax
 * @date 2019/2/12
 */
public class SubtractCalculate implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
