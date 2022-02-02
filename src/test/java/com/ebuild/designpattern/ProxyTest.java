package com.ebuild.designpattern;


import com.ebuild.designpattern.proxy.Client;
import com.ebuild.designpattern.proxy.ConcreteSubject;
import com.ebuild.designpattern.proxy.SubjectCacheProxy;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;

@Slf4j
public class ProxyTest {

  @org.junit.jupiter.api.Test
   void call_concrete_test(){
    // given
    ConcreteSubject subject = new ConcreteSubject();
    Client client = new Client(subject);

    // when
    StopWatch stopWatch = StopWatch.createStarted();
    client.execute();
    client.execute();
    client.execute();
    stopWatch.stop();

    // then
    log.info(stopWatch.toString());

  }

  @org.junit.jupiter.api.Test
  void call_proxy_test(){
    // given
    ConcreteSubject subject = new ConcreteSubject();
    SubjectCacheProxy proxy = new SubjectCacheProxy(subject);
    Client client = new Client(proxy);

    // when
    StopWatch stopWatch = StopWatch.createStarted();
    client.execute();
    client.execute();
    client.execute();
    stopWatch.stop();

    // then
    log.info(stopWatch.toString());

  }

}
