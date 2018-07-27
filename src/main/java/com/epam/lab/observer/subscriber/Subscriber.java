package com.epam.lab.observer.subscriber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Subscriber implements Observer {
    private final static Logger LOG = LogManager.getLogger(Subscriber.class);

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        LOG.info(String.format("Dear %s! We have some changes in vacancies \n %s\n", name, vacancies));
    }
}
