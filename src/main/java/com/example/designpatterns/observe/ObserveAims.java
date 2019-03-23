package com.example.designpatterns.observe;

import lombok.Data;

import java.util.Observable;

/**
 * <p>DESC: 被观察者</p>
 * <p>DATE: 2019/3/23</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Data
class ObserveAims extends Observable {
    private String name;

    void publishQuestion(Question question) {
        System.out.println(this.name+ "收到了一条" + question.getMsg() + "的消息。");
        setChanged();
        notifyObservers(question);
    }
}
