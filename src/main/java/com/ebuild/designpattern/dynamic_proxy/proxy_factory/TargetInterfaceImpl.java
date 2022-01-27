package com.ebuild.designpattern.dynamic_proxy.proxy_factory;

public class TargetInterfaceImpl implements TargetInterface{

  @Override
  public String targetMethod() {
    return "target [interface] return value";
  }
}
