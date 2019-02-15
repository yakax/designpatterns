package com.example.designpatterns.abstractfactory.product;

/**
 * 蒙牛产品
 */
public class Mengniu implements Milk {
    @Override
    public String getName() {
        return "蒙牛";
    }
}
