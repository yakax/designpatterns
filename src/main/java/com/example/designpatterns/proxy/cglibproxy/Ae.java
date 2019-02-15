package com.example.designpatterns.proxy.cglibproxy;

/**
 * @author yakax
 * @date 2019/2/1
 */
public class Ae {
    public void pointTakeaway() {
        System.out.println("我想要一份炸鸡1");
    }

    /**
     * final 方法不会被生成的子类覆盖
     */
    public final void sendDelivery() {
        System.out.println("帮我寄快递1");
    }

}
