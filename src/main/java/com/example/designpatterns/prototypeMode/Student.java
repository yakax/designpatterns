package com.example.designpatterns.prototypeMode;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * @author yakax
 * @date 2019/1/29
 */
@Getter
@Setter
public class Student implements Serializable {
    private String name;
    private int id;
    private Lesson lesson;

    protected Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (Student) objectInputStream.readObject();

    }

}
