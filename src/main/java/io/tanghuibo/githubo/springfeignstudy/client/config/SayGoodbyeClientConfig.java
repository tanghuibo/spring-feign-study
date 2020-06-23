package io.tanghuibo.githubo.springfeignstudy.client.config;

import feign.RequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author tanghuibo
 * @date 2020/6/23下午11:57
 */
public class SayGoodbyeClientConfig {

    Logger logger = LoggerFactory.getLogger(SayGoodbyeClientConfig.class);


    @Bean
    RequestInterceptor feignLoggerLevel(){
        return requestTemplate -> {
            logger.info("sayGoodBay:" + requestTemplate.toString());
        };
    }
}
