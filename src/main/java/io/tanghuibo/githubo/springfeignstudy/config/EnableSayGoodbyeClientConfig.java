package io.tanghuibo.githubo.springfeignstudy.config;

import io.tanghuibo.githubo.springfeignstudy.client.SayGoodbyeClient;
import io.tanghuibo.githubo.springfeignstudy.client.config.SayGoodbyeClientConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2020/6/24上午12:24
 */
@Configuration
@EnableFeignClients(
        clients = SayGoodbyeClient.class,
        defaultConfiguration = SayGoodbyeClientConfig.class
)
public class EnableSayGoodbyeClientConfig {
}
