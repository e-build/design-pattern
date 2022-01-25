package com.ebuild.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyImpl2 implements Strategy{

  @Override
  public void call() {
    log.info("비즈니스 로직 실행 2");
  }
}
