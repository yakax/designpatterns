package com.example.designpatterns.delegation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/17</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Slf4j
public class ProgrammerB implements Action {
    @Override
    public void doing(String command) {
        log.info("我是码农B：我开始工作" + command);
    }
}
