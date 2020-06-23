package io.tanghuibo.githubo.springfeignstudy.config;

import io.tanghuibo.githubo.springfeignstudy.client.SayHelloClient;
import io.tanghuibo.githubo.springfeignstudy.client.config.SayHelloClientConfig;
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
