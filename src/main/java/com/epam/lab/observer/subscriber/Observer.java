package com.epam.lab.observer.subscriber;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
