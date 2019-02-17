package com.example.designpatterns.strategyMode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yakax
 * @date 2019/2/12
 */
@Slf4j
public class test {
    public static void main(String[] args) {
        log.info(String.valueOf(ContextEnum.ADD.getStrategy().calculate(3, 2)));
        log.info(String.valueOf(ContextEnum.SUBTRACT.getStrategy().calculate(3, 2)));
    }
}
