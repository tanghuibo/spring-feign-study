package io.tanghuibo.githubo.springfeignstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author thb
 */
@SpringBootApplication
@EnableFeignClients
public class SpringFeignStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignStudyApplication.class, args);
	}

}
