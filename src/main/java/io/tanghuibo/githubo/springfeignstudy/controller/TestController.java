package io.tanghuibo.githubo.springfeignstudy.controller;

import io.tanghuibo.githubo.springfeignstudy.client.SayGoodbyeClient;
import io.tanghuibo.githubo.springfeignstudy.client.SayHelloClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tanghuibo
 * @date 2020/6/23下午11:51
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    SayGoodbyeClient sayGoodbyeClient;

    @Resource
    SayHelloClient sayHelloClient;


    @RequestMapping("sayHello")
    public String testSayHello(@RequestParam String name) {
        return sayHelloClient.sayHello(name);
    }

    @RequestMapping("sayGoodbye")
    public String testSayGoodbye(@RequestParam String name) {
        return sayGoodbyeClient.sayGoodbye(name);
    }
}
