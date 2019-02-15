package com.example.designpatterns.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yakax
 * @date 2019/1/31
 */
public class Mom implements InvocationHandler {

    private Object object;

    Object getInstance(Object o) {
        this.object = o;
        Class<?> clazz = o.getClass();
        // 生成新的对象
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * 类似动态代理拦截器
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");

        if ("pointTakeaway".equals(method.getName())) {
            System.out.println("我儿子叫我帮他点外卖");
        } else if ("sendDelivery".equals(method.getName())) {
            System.out.println("我儿子叫我帮他寄快递");
        }

        method.invoke(this.object, args);

        return null;
    }
}
