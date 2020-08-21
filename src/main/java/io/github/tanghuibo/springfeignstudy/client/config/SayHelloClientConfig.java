package io.github.tanghuibo.springfeignstudy.client.config;

import feign.RequestInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author tanghuibo
 * @date 2020/6/23下午11:57
 */
public class SayHelloClientConfig {

    Logger logger = LoggerFactory.getLogger(SayHelloClientConfig.class);


    @Bean("feignLoggerLevel1")
    RequestInterceptor feignLoggerLevel(){
        return requestTemplate -> {
            logger.info("sayHello:" + requestTemplate.toString());
        };
    }
}
