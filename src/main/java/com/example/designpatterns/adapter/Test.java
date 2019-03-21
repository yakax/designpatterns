package com.example.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>DESC: </p>
 * <p>DATE: 2019/3/21</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: YAKAX</p>
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter(new ReadyAdapter());
        target.methed();
    }
}
