package com.epam.lab.observer.observable;

import com.epam.lab.observer.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobsWebsite implements Observable {
    private List<String> vacancies = new ArrayList<>();
    private ArrayList<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObserver();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer subscriber : subscribers) {
            subscriber.handleEvent(this.vacancies);
        }
    }
}
