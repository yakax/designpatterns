package com.example.designpatterns.delegation;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>DESC: 领导类</p>
 * <p>DATE: 2019/3/17</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Slf4j
public class Leader implements Action {

    private Map<String, Action> targets = new HashMap<>();

    Leader() {
        targets.put("加密", new ProgrammerA());
        targets.put("登录", new ProgrammerB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
