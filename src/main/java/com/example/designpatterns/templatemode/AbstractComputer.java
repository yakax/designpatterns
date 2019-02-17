package com.example.designpatterns.templatemode;

/**
 * @author yakax
 * @date 2019/2/17
 */
abstract class AbstractComputer {
    final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.hotOil();
        //第三步：倒蔬菜
        this.pourVegetables();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    private void pourOil() {
        System.out.println("开始倒油");
    }

    private void hotOil() {
        System.out.println("开始热油咯");
    }

    /**
     * 具体倒什么蔬菜
     */
    abstract void pourVegetables();

    /**
     * 具体放什么调料
     */
    abstract void pourSauce();

    private void fry() {
        System.out.println("炒熟");
    }
}
