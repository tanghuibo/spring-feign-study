package io.tanghuibo.githubo.springfeignstudy.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tanghuibo
 * @date 2020/6/23下午11:44
 */
@FeignClient(
        name = "sayGoodbyeClient",
        url = "http://127.0.0.1:8080",
        path = "helloWorld"
)
public interface SayGoodbyeClient {

    /**
     * say hello
     * @param name
     * @return
     */
    @GetMapping("sayGoodbye")
    String sayGoodbye(@RequestParam("name") String name);
}
