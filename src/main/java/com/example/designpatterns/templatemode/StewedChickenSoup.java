package com.example.designpatterns.templatemode;

/**
 * @author yakax
 * @date 2019/2/17
 */
class StewedChickenSoup extends AbstractComputer {
    @Override
    void pourVegetables() {
        System.out.println("放老母鸡下去");
    }

    @Override
    void pourSauce() {
        System.out.println("放枸杞");
    }
}
