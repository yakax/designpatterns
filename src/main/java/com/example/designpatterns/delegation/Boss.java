package com.example.designpatterns.delegation;

/**
 * <p>DESC: 老板类</p>
 * <p>DATE: 2019/3/17</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
class Boss {

    /**
     * 传命令给领导让他分发任务
     *
     * @param command 什么事情
     * @param leader 那个领导
     */
    void command(String command, Leader leader) {
        leader.doing(command);
    }
}
