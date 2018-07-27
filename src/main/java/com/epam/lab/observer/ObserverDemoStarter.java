package com.epam.lab.observer;

import com.epam.lab.observer.observable.JobsWebsite;
import com.epam.lab.observer.subscriber.Observer;
import com.epam.lab.observer.subscriber.Subscriber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ObserverDemoStarter {
    private final static Logger LOG = LogManager.getLogger(ObserverDemoStarter.class);
    static String USER_DIR = "user.dir";
    static String PATH = "\\src\\main\\resources\\observer\\observerOverviaw";

    public static void startObserverDemo() {
        showPatternOverview();

        jobSearchLogic();
    }

    private static void jobSearchLogic() {
        JobsWebsite site = new JobsWebsite();
        site.addVacancy("Junior Test Automation Engineer");

        Observer firstSubscriber = new Subscriber("Jonny");
        Observer secondSubscriber = new Subscriber("Nelly");
        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        LOG.info(">>>>Add new vacancy to website");
        site.addVacancy("Middle Test Automation Engineer");

        LOG.info(">>>>Remove vacancy from website");
        site.removeVacancy("Junior Test Automation Engineer");

        site.removeObserver(firstSubscriber);
    }

    private static void showPatternOverview() {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(System.getProperty(USER_DIR) + PATH)));
            bufferedReader.lines().forEach(l -> stringBuilder.append(l).append("\n"));
            LOG.info(stringBuilder);
        } catch (FileNotFoundException e) {
            LOG.error("File not found" + e.getMessage());
        }
    }
}
