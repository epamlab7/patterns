package com.epam.lab.strategy.controller;

import com.epam.lab.strategy.StartStrategyDemo;
import com.epam.lab.strategy.model.ContextStrategy;
import com.epam.lab.strategy.model.FullPrice;
import com.epam.lab.strategy.model.HalfPrice;
import com.epam.lab.strategy.model.ThreeQuartersPrice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class MyStrategyMenu {

    private final static Logger log = LogManager.getLogger(MyStrategyMenu.class);

    public static void getPersonalData() {
        Scanner scanKeyboard = new Scanner(System.in);
        log.info("If you want return in main menu, press any character (+ENTER)");
        log.info("select a day of the week, to find the price of the product(hat - 100.00 UAN): (+ENTER)");
        double priceHat = 100.0;
        log.info("for example: 1 - Monday");
        while (scanKeyboard.hasNext()) {
            if (scanKeyboard.hasNextInt()) {
                Integer i = scanKeyboard.nextInt();
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        log.info(String.format("A hat - %.2f UAN", new ContextStrategy(new ThreeQuartersPrice()).getPrice(priceHat)));
                        break;
                    case 5:
                        log.info(String.format("A hat - %.2f UAN", new ContextStrategy(new HalfPrice()).getPrice(priceHat)));
                        break;
                    case 6:
                    case 7:
                        log.info(String.format("A hat - %.2f UAN", new ContextStrategy(new FullPrice()).getPrice(priceHat)));
                        break;
                    default:
                        log.info("you entered wrong");
                        break;
                }
                MyStrategyMenu.getPersonalData();
            } else {
                StartStrategyDemo.getStrategy();
                break;
            }
        }
    }
}
