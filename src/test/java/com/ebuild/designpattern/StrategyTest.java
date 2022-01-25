package com.ebuild.designpattern;

import com.ebuild.designpattern.strategy.Context;
import com.ebuild.designpattern.strategy.StrategyImpl1;
import com.ebuild.designpattern.strategy.StrategyImpl2;
import org.junit.jupiter.api.Test;

public class StrategyTest {

  @Test
  void test(){
      // given
    Context context1 = new Context(new StrategyImpl1());
    Context context2 = new Context(new StrategyImpl2());

      // when
    context1.execute();
    context2.execute();
  }

}
