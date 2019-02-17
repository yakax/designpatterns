package com.example.designpatterns.strategyMode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yakax
 * @date 2019/2/12
 */
@Slf4j
enum ContextEnum {
    // 加法
    ADD(new AddCalculate()),
    // 减法
    SUBTRACT(new SubtractCalculate());

    private Strategy strategy;

    ContextEnum(Strategy strategy) {
        this.strategy = strategy;
    }

    Strategy getStrategy() {
        return this.strategy;
    }
}
