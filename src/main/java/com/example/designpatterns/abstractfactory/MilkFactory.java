package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.abstractfactory.product.Erie;
import com.example.designpatterns.abstractfactory.product.Mengniu;
import com.example.designpatterns.abstractfactory.product.Milk;
import com.example.designpatterns.abstractfactory.product.Sanlu;

/**
 * 具体怎么生产
 */
public class MilkFactory extends AbstractFactory {
    @Override
    Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    Milk getErie() {
        return new Erie();
    }

    @Override
    Milk getSanlu() {
        return new Sanlu();
    }
}
