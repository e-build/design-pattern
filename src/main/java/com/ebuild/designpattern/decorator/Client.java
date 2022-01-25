package com.ebuild.designpattern.decorator;

public class Client {

  private Component component;

  public Client(Component component) {
    this.component = component;
  }

  public String execute(){
    return component.operation();
  }
}
