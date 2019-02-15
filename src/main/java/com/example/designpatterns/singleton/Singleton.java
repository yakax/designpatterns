package com.example.designpatterns.singleton;

public class Singleton {

    //普通单例饿汉式
//    private static Singleton singleton = new Singleton();
//    private Singleton() {
//    }
//    public static Singleton getInstance() {
//        return singleton;
//    }
    //普通单例懒汉式
//    private static Singleton singleton;
//    private Singleton() {
//    }
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }


    //线程双重校验
//    private static volatile Singleton singleton;
//    private Singleton() {
//    }
//    public static Singleton getInstance() {
//        // 先判断是否有线程实例对象已经创建。这样会让其他线程不会去等待获取锁
//        if (singleton == null) {
//            // 让先进入线程的线程创建示例
//            synchronized (Singleton.class) {
//                // 可能在同时进入时别的线程已经创建成功了
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    // 静态内部类
    private Singleton() {
    }
    private static class SingleTonBuilder {
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getInstance() {
        return SingleTonBuilder.singleton;
    }
}
