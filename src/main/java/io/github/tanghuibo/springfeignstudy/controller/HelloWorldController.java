package io.github.tanghuibo.springfeignstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author tanghuibo
 * @date 2020/6/23下午11:39
 */
@RestController
@RequestMapping("helloWorld")
public class HelloWorldController {

    @GetMapping("sayHello")
    public String sayHello(@RequestParam String name) {
        return String.format("hello %s", name);
    }

    @GetMapping("sayGoodbye")
    public String sayGoodbye(@RequestParam String name) {
        return String.format("goodbye %s", name);
    }
}
