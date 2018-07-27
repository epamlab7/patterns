package com.epam.lab;

import com.epam.lab.commandApp.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");
    static private Scanner scan = new Scanner(System.in);
    private static Executor executor = new Executor();
    private static Invoker invoker = new Invoker(new CommandAbstractFactory(executor), new CommandBridge(executor),
            new CommandFactoryMethod(executor), new CommandTemplateMethod(executor), new CommandPrototype(executor),
            new CommandObserver(executor), new CommandSingleton(executor), new CommandIterator(executor),
            new CommandAdapter(executor), new CommandBridge(executor), new CommandDecorator(executor),
            new CommandFacade(executor), new CommandComposite(executor), new CommandStrategy(executor),
            new CommandProxy(executor), new CommandChainOfResponsibility(executor), new CommandCommand(executor),
            new CommandMediator(executor), new CommandMemento(executor));

    public static void main(String[] args) throws IOException {
        int number;
        String action;
        do {
            ask();
            number = scan.nextInt();
            checkNumber(number);
            LOG.info("Do you want to continue? (y - Yes / n - No)");
            action = scan.next();
        } while (action.equals("y"));
    }

    private static void ask() {
        LOG.info("Please enter number:");
        LOG.info("1 - to execute Abstract Factory pattern example");
        LOG.info("2 - to execute Builder pattern example");
        LOG.info("3 - to execute Factory Method pattern example");
        LOG.info("4 - to execute Template Method pattern example");
        LOG.info("5 - to execute Prototype pattern example");
        LOG.info("6 - to execute Observer pattern example");
        LOG.info("7 - to execute Singleton pattern example");
        LOG.info("8 - to execute Iterator pattern example");
        LOG.info("9 - to execute Adapter pattern example");
        LOG.info("10 - to execute Bridge pattern example");
        LOG.info("11 - to execute Decorator pattern example");
        LOG.info("12 - to execute Facade pattern example");
        LOG.info("13 - to execute Composite pattern example");
        LOG.info("14 - to execute Strategy pattern example");
        LOG.info("15 - to execute Proxy pattern example");
        LOG.info("16 - to execute Chain Of Responsibility pattern example");
        LOG.info("17 - to execute Command pattern example");
        LOG.info("18 - to execute Mediator pattern example");
        LOG.info("19 - to execute Memento pattern example");
    }

    private static void checkNumber(int number) throws IOException {
        switch (number) {
            case 1:
                invoker.executeAbstractFactory();
                break;
            case 2:
                invoker.executeBuilder();
                break;
            case 3:
                invoker.executeFactoryMethod();
                break;
            case 4:
                invoker.executeTemplateMethod();
                break;
            case 5:
                invoker.executePrototype();
                break;
            case 6:
                invoker.executeObserver();
                break;
            case 7:
                invoker.executeSingleton();
                break;
            case 8:
                invoker.executeIterator();
                break;
            case 9:
                invoker.executeAdapter();
                break;
            case 10:
                invoker.executeBridge();
                break;
            case 11:
                invoker.executeDecorator();
                break;
            case 12:
                invoker.executeFacade();
                break;
            case 13:
                invoker.executeComposite();
                break;
            case 14:
                invoker.executeStrategy();
                break;
            case 15:
                invoker.executeProxy();
                break;
            case 16:
                invoker.executeChainOfResponsibility();
                break;
            case 17:
                invoker.executeCommand();
                break;
            case 18:
                invoker.executeMediator();
                break;
            case 19:
                invoker.executeMemento();
            default:
                LOG.info("Number isn't correct...");
                break;
        }
        System.out.println();
    }
}