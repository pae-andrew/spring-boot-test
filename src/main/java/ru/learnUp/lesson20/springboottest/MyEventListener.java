package ru.learnUp.lesson20.springboottest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import static ru.learnUp.lesson20.springboottest.MyGame.*;

@Component
public class MyEventListener implements ApplicationListener<MyEvent>, ApplicationContextAware {
    ApplicationContext context;

    @Override
    public void onApplicationEvent(MyEvent event) {
        if (!Utils.isNumeric(event.getData())) {
            System.out.println(context.getMessage(event.getData(), new Object[]{AttemptCounter}, locale));
        }
        else if (x == Integer.parseInt(event.getData())) {
            System.out.println(context.getMessage("win", new Object[]{event.getData()}, locale));
        }
        else if (x > Integer.parseInt(event.getData())) {
            System.out.println(context.getMessage("bigger", null, locale));
        }
        else {
            System.out.println(context.getMessage("less", null, locale));
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
