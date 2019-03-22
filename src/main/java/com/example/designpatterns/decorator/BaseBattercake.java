package com.example.designpatterns.decorator;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/22</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public abstract class BaseBattercake {
    /**
     * 我要买什么
     *
     * @return
     */
    protected abstract String Msg();

    /**
     * 多少钱
     *
     * @return
     */
    protected abstract int price();
}
