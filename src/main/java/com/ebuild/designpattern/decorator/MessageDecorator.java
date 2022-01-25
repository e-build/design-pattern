package com.ebuild.designpattern.decorator;

public class MessageDecorator implements Component{

  private Component component;

  public MessageDecorator(Component component) {
    this.component = component;
  }

  @Override
  public String operation() {
    return "#####" + component.operation() + "#####";
  }
}
