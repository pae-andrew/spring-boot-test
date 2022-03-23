package ru.learnUp.lesson20.springboottest;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private final String data;

    public MyEvent(String data) {
        super(data);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
