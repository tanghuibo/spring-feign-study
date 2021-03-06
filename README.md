# spring-feign-study

spring 框架集成 feign 学习

## 多 feign 个性化配置

代码中有两个 client:

- SayGoodbyeClient
- SayHelloClient

两个 client 分别对应两个 feignConfig:

- SayGoodbyeClientConfig
- SayHelloClientConfig

要想实现个性化配置这两个 feignConfig 不能被 spring 框架加载， 否则会同时生效。所以不能使用 @Configuration 注解

为了使 feignConfig 生效，添加 enableFeignConfig:

- EnableSayGoodbyeClientConfig

```java
@Configuration
@EnableFeignClients(
        clients = SayGoodbyeClient.class
//        defaultConfiguration 的作用域是全局的，不要配置
//        defaultConfiguration = SayGoodbyeClientConfig.class
)
public class EnableSayGoodbyeClientConfig {
}
```

- EnableSayHelloClientConfig

```java
@Configuration
@EnableFeignClients(
        clients = SayHelloClient.class
//        defaultConfiguration 的作用域是全局的，不要配置
//        defaultConfiguration = SayHelloClientConfig.class
)
public class EnableSayHelloClientConfig {
}
```

- FeignClient

```java
@FeignClient(
        name = "sayGoodbyeClient",
//      configuration 的作用域是单个client
        configuration = SayGoodbyeClientConfig.class
)
public interface SayGoodbyeClient { 
}
```

```java
@FeignClient(
        name = "sayHelloClient",
//      configuration 的作用域是单个client
        configuration = SayHelloClientConfig.class
)
public interface SayHelloClient {
}
```

