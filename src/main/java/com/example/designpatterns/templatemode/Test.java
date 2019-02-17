package com.example.designpatterns.templatemode;

/**
 * @author yakax
 * @date 2019/2/17
 */
public class Test {
    public static void main(String[] args) {
        AbstractComputer friedCabbage=new FriedCabbage();
        friedCabbage.cookProcess();
        AbstractComputer stewedChickenSoup=new StewedChickenSoup();
        stewedChickenSoup.cookProcess();
    }
}
