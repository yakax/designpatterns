package com.example.designpatterns.decorator;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/22</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public class EggDecorator extends BaseBattercakeDecotator {
    EggDecorator(BaseBattercake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    protected String Msg() {
        return super.Msg() + "加一个蛋";
    }

    @Override
    protected int price() {
        return super.price() + 1;
    }
}
