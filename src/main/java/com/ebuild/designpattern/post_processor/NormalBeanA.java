package com.ebuild.designpattern.post_processor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NormalBeanA {

  public void hello(){
    log.info("helloA");
  }

  public void exceptMethod() {
    log.info("exceptMethod");
  }

}
