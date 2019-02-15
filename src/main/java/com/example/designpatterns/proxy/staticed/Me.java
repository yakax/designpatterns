package com.example.designpatterns.proxy.staticed;

/**
 * @author yakax
 * @date 2019/1/31
 */
public class Me implements Person {
    @Override
    public void findLove() {
        System.out.println("年龄比我小");
        System.out.println("有共同爱好");
        System.out.println("好相处");
    }
}
