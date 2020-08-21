package io.github.tanghuibo.springfeignstudy.config;

import io.github.tanghuibo.springfeignstudy.client.config.SayHelloClientConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2020/6/24上午12:24
 */
@Configuration
@EnableFeignClients(
        basePackages = "io.github.tanghuibo.springfeignstudy.client.hello",
        defaultConfiguration = SayHelloClientConfig.class
)
public class EnableSayHelloClientConfig {
}
