package com.example.designpatterns.decorator;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/22</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public class Battercake extends BaseBattercake {
    @Override
    protected String Msg() {
        return "煎饼";
    }

    @Override
    protected int price() {
        return 5;
    }
}
