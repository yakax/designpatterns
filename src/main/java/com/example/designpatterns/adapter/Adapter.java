package com.example.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/21</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Slf4j
public class Adapter implements Target {

    private ReadyAdapter readyAdapter;

    Adapter(ReadyAdapter readyAdapter) {
        this.readyAdapter = readyAdapter;
    }

    @Override
    public void methed() {
        readyAdapter.methed();
        log.info("可以在这里做适配操作");
    }
}
