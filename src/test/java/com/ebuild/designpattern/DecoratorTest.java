package com.ebuild.designpattern;

import com.ebuild.designpattern.decorator.Client;
import com.ebuild.designpattern.decorator.ConcreteComponent;
import com.ebuild.designpattern.decorator.MessageDecorator;
import com.ebuild.designpattern.decorator.TimeDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorTest {

  @org.junit.jupiter.api.Test
  void no_decorator(){
    // given
    ConcreteComponent concreteComponent = new ConcreteComponent();
    Client client = new Client(concreteComponent);

    // when
    String result = client.execute();

    // then
    log.info("result : {}", result);

  }

  @org.junit.jupiter.api.Test
  void message_decorator(){
    // given
    MessageDecorator component = new MessageDecorator(new ConcreteComponent());
    Client client = new Client(component);

    // when
    String result = client.execute();

    // then
    log.info("result : {}", result);

  }

  @org.junit.jupiter.api.Test
  void decorator_chain(){
    // given
    TimeDecorator timeDecorator = new TimeDecorator(new MessageDecorator(new ConcreteComponent()));

    Client client = new Client(timeDecorator);

    // when
    String result = client.execute();

    // then
    log.info("result : {}", result);

  }

}
