package com.example.designpatterns.delegation;

/**
 * <p>DESC: 共有的方法接口</p>
 * <p>DATE: 2019/3/17</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public interface Action {

    /**
     * 接收方法执行
     *
     * @param command 命令信息
     */
    void doing(String command);
}
