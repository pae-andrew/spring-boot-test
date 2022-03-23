package ru.learnUp.lesson20.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);

		MyGame.gameProcess(context);
	}

}
