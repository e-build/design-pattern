package com.ebuild.designpattern.dynamic_proxy.proxy_factory;

public class TargetClass {

  public String targetMethod(){
    return "target [class] return value";
  }

  public String exceptMethod(){
    return "excluding that method";
  }

}
