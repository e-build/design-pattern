package com.ebuild.designpattern.post_processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NormalBeanConfig {

  @Bean
  public NormalBeanA normalBeanA(){
    return new NormalBeanA();
  }



}
