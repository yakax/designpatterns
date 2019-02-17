package com.example.designpatterns.templatemode;

/**
 * @author yakax
 * @date 2019/2/17
 */
class FriedCabbage extends AbstractComputer {
    @Override
    void pourVegetables() {
        System.out.println("把白菜倒下去");

    }

    @Override
    void pourSauce() {
        System.out.println("放干辣椒");
    }
}
