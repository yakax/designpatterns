package com.example.designpatterns.observe;

import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>DESC: 观察者</p>
 * <p>DATE: 2019/3/23</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Data
public class EyeOfGod implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        // 被观察者信息
        ObserveAims observeAims = (ObserveAims) o;
        // 给被观察者的信息
        Question question = (Question)arg;
        System.out.println(this.name+"给"+observeAims.getName()+"发布了"+question.getMsg());
    }
}
