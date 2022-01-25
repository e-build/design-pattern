package com.ebuild.designpattern.decorator;

public class ConcreteComponent implements Component{

  @Override
  public String operation() {
    return " 구체 컴포넌트 실행 ";
  }
}
