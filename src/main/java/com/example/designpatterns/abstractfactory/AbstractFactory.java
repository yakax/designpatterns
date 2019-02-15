package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.abstractfactory.product.Milk;

/**
 * 抽象工厂生产那些产品
 */
public abstract class AbstractFactory {

    abstract Milk getMengniu();

    abstract Milk getErie();

    abstract Milk getSanlu();
}
