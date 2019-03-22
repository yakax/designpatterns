package com.example.designpatterns.decorator;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/22</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public abstract class BaseBattercakeDecotator extends BaseBattercake {

    private BaseBattercake baseBattercake;

    BaseBattercakeDecotator(BaseBattercake baseBattercake) {
        this.baseBattercake = baseBattercake;
    }

    @Override
    protected String Msg() {
        return this.baseBattercake.Msg();
    }

    @Override
    protected int price() {
        return this.baseBattercake.price();
    }
}
