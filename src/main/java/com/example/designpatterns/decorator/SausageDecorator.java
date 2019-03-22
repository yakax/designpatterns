package com.example.designpatterns.decorator;

/**
 * Created by Tom on 2019/3/17.
 */
public class SausageDecorator extends BaseBattercakeDecotator {
     SausageDecorator(BaseBattercake baseBattercake) {
        super(baseBattercake);
    }

    @Override
    protected String Msg() {
        return super.Msg() + "加一根香肠";
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }
}
