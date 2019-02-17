package com.example.designpatterns.prototypemode;

/**
 * @author yakax
 * @date 2019/1/29
 */
public class ShallowTest {
    public static void main(String[] args) {
        Student student = new Student();
        Lesson lesson = new Lesson();
        student.setLesson(lesson);

        try {
            Student cloneStuden = (Student) student.deepClone();
            System.out.println(cloneStuden == student);
            System.out.println(cloneStuden.getLesson() == student.getLesson());
        } catch (Exception e) {
            System.out.println("克隆失败!");
            e.printStackTrace();
        }
    }
}
