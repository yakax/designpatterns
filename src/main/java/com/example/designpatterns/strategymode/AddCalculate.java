package com.example.designpatterns.strategymode;

/**
 * @author yakax
 * @date 2019/2/12
 */
public class AddCalculate implements Strategy{

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
