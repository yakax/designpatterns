package com.example.designpatterns.observe;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/23</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public class Test {
    public static void main(String[] args) {
        EyeOfGod eyeOfGod=new EyeOfGod();
        eyeOfGod.setName("老师");

        ObserveAims observeAims =new ObserveAims();
        observeAims.setName("小明");

        Question question=new Question();
        question.setMsg("写作业");

        eyeOfGod.update(observeAims,question);
        observeAims.publishQuestion(question);
    }
}
