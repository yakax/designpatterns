package com.example.designpatterns.proxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author yakax
 * @date 2019/1/31
 */
public class test {
    public static void main(String[] args) {
        // 被代理对象
        Me me = new Me();
        Me1 me1=new Me1();

        try {
            // 动态代理
//            Person instance = (Person) new Mom().getInstance(me);
//            System.out.println("生成的代理类"+instance.getClass());
//            instance.pointTakeaway();
//            instance.sendDelivery();

            Person instance1 = (Person) new Mom().getInstance(me1);
            System.out.println("生成的代理类"+instance1.getClass());
            instance1.pointTakeaway();
            instance1.sendDelivery();

            //JDK中有个规范，只要要是$开头的一般都是自动生成的
            //通过反编译工具可以查看源代码

            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
