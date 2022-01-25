package com.ebuild.designpattern;

import com.ebuild.designpattern.template_callback.Template;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {

  @Test
  void test() {
    // given
    Template template = new Template();

    // when
    template.execute(() -> log.info("콜백 메서드 실행"));
  }

}
