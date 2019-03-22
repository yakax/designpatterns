package com.example.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/22</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        // 买一个煎饼
        BaseBattercake baseBattercake = new Battercake();
        // 加鸡蛋
        baseBattercake = new EggDecorator(baseBattercake);
        log.info(baseBattercake.Msg() + baseBattercake.price());

        baseBattercake = new SausageDecorator(baseBattercake);
        log.info(baseBattercake.Msg() + baseBattercake.price());
    }
}
