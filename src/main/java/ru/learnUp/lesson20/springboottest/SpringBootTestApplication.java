package ru.learnUp.lesson20.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;
import java.util.Random;

import static ru.learnUp.lesson20.springboottest.MyGame.AttemptCounter;
import static ru.learnUp.lesson20.springboottest.MyGame.locale;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);

		MyGame.gameProcess(context);
	}

}
