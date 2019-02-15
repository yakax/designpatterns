package com.example.designpatterns.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yakax
 * @date 2019/2/1
 */
public class CglibProxy implements MethodInterceptor {
    private Object object;

    CglibProxy(Object o) {
        this.object = o;
    }

    Object getInstance() {
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(this.object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 这里可以做代理类的操作
        methodProxy.invokeSuper(o, objects);
        return null;
    }
}
