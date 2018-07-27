package com.epam.lab.observer.observable;

import com.epam.lab.observer.subscriber.Observer;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
