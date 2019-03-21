package com.example.designpatterns.delegation;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/17</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command("加密", leader);
        boss.command("登录", leader);
    }
}
