package com.ebuild.designpattern.decorator;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;

@Slf4j
public class TimeDecorator implements Component{

  private Component component;

  public TimeDecorator(Component component) {
    this.component = component;
  }

  @Override
  public String operation() {
    StopWatch stopWatch = StopWatch.createStarted();
    String result = component.operation();
    stopWatch.stop();
    log.info("컴포넌트 실행 시간 측정 : {}", stopWatch.toString());
    return result;
  }

}
