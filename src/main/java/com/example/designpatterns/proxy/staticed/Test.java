package com.example.designpatterns.proxy.staticed;

/**
 * @author yakax
 * @date 2019/1/31
 */
public class Test {
    public static void main(String[] args) {
        // Meipo是代理对象 Me是被代理对象
        Meipo meipo = new Meipo(new Me());
        meipo.findLove();
    }
}
