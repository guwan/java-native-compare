package top.knos.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		SpringApplication.run(SpringHelloWorldApplication.class, args);
	}

}
