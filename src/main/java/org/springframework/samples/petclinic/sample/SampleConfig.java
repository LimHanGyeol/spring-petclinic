package org.springframework.samples.petclinic.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    // Bean 설정파일을 통해 Bean으로 등록하여 @Controller를 작성하지 않아도 작동이 된다.
    @Bean
    public SampleController sampleController() {
        return new SampleController();
    }

}
