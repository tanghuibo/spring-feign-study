package io.github.tanghuibo.springfeignstudy.config;

import io.github.tanghuibo.springfeignstudy.client.SayHelloClient;
import io.github.tanghuibo.springfeignstudy.client.config.SayHelloClientConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2020/6/24上午12:24
 */
@Configuration
@EnableFeignClients(
        clients = SayHelloClient.class,
        defaultConfiguration = SayHelloClientConfig.class
)
public class EnableSayHelloClientConfig {
}
