package io.github.tanghuibo.springfeignstudy.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2020/6/24上午12:24
 */
@Configuration
@EnableFeignClients(
        basePackages = "io.github.tanghuibo.springfeignstudy.client.goodbye"
)
public class EnableSayGoodbyeClientConfig {
}
