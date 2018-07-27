package com.epam.lab.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.lab.strategy.controller.MyStrategyMenu;

import java.util.Scanner;

public class StartStrategyDemo {

    private final static Logger log = LogManager.getLogger(StartStrategyDemo.class);

    public static void getStrategy() {
        Scanner scanKeyboard = new Scanner(System.in);
        log.info("If you want return in main menu, press any character (+ENTER)");
        log.info("If you want to continue - press any number (+ENTER)");
        while (scanKeyboard.hasNext()) {
            if (scanKeyboard.hasNextInt()) {
                Integer i = scanKeyboard.nextInt();
                MyStrategyMenu.getPersonalData();
            } else {
                System.out.println("main menu");
                break;
            }
        }
    }
}

