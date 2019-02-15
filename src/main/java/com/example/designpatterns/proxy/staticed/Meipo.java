package com.example.designpatterns.proxy.staticed;

/**
 * @author yakax
 * @date 2019/1/31
 */
class Meipo implements Person {
    private Person person;
    Meipo(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("媒婆在帮你寻找");
        this.person.findLove();
        System.out.println("目前没找到");
    }
}
