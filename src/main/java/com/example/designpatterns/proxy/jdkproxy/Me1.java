package com.example.designpatterns.proxy.jdkproxy;

/**
 * @author yakax
 * @date 2019/1/31
 */
public class Me1 implements Person {
    @Override
    public void pointTakeaway() {
        System.out.println("我想要一份炸鸡1");
    }

    @Override
    public void sendDelivery() {
        System.out.println("帮我寄快递1");
    }
}
