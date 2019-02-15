package com.example.designpatterns.abstractfactory;

/**
 * @author yakax
 * @date 2019/1/10
 */
public class Main {
    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getSanlu().getName());
    }
}
