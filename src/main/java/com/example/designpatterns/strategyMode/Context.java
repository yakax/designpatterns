package com.example.designpatterns.strategyMode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yakax
 * @date 2019/2/12
 */
@Slf4j
class Context {
    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}
