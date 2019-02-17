package com.example.designpatterns.proxy.cglibproxy;

/**
 * @author yakax
 * @date 2019/2/1
 */
public class test {
    public static void main(String[] args) {
        Me m=new Me();
        // 这里根据自己需要代理的类传值
        Me me = (Me)new CglibProxy(m).getInstance();
        me.pointTakeaway();
        me.sendDelivery();
    }
}
