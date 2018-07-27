package com.epam.lab.commandApp;

import com.epam.lab.abstractFactory.AbstractFactoryDemoStarter;
import com.epam.lab.adapter.StartAdapterPattern;
import com.epam.lab.bridge.BridgePatternDemo;
import com.epam.lab.builder.StartBuilderPattern;
import com.epam.lab.command.CommandDemo;
import com.epam.lab.composite.CompositeDemoStarter;
import com.epam.lab.decorator.DecoratorDemoStarter;
import com.epam.lab.facade.FacadeDemoStarter;
import com.epam.lab.factoryMethod.FactoryMethodTest;
import com.epam.lab.iterator.IteratorDemoStarter;
import com.epam.lab.mediator.Main;
import com.epam.lab.observer.ObserverDemoStarter;
import com.epam.lab.prototype.PrototypeDemoStarter;
import com.epam.lab.proxy.ProxyDemoStarter;
import com.epam.lab.responsibilityChain.ResponsibilityChainDemo;
import com.epam.lab.singleton.SingletonDemoStarter;
import com.epam.lab.strategy.StartStrategyDemo;
import com.epam.lab.templateMethod.TemplateMethodTest;
import org.apache.log4j.Logger;

import java.io.IOException;

public class Executor {
    private static Logger log = Logger.getLogger(Executor.class);

    void abstractFactoryExample() throws IOException {
        AbstractFactoryDemoStarter.startAbstractFactoryDemo();
    }

    void builderExample() {
        StartBuilderPattern.startDecoratorDemo();
    }

    void factoryMethodExample() {
        FactoryMethodTest.factoryMethodRun();
    }

    void templateMethodExample() throws IOException {
        TemplateMethodTest.templateMethodRun();
    }

    void prototypeExample() {
        PrototypeDemoStarter.startPrototypeDemo();
    }

    void observerExample() {
        ObserverDemoStarter.startObserverDemo();
    }

    void singletonExample() throws IOException {
        SingletonDemoStarter.startSingletonDemo();
    }

    void iteratorExample() throws IOException {
        IteratorDemoStarter.startIteratorDemo();
    }

    void adapterExample() {
        StartAdapterPattern adapterPatternDemo = new StartAdapterPattern();
        adapterPatternDemo.startAdapterPattern();
    }

    void bridgeExample() {
        BridgePatternDemo.startBridgePattern();
    }

    void decoratorExample() {
        DecoratorDemoStarter.startDecoratorDemo();
    }

    void facadeExample() {
        FacadeDemoStarter.startDecoratorDemo();
    }

    void compositeExample() {
        CompositeDemoStarter compositeDemoStarter = new CompositeDemoStarter();
        compositeDemoStarter.startCompositeDemo();
    }

    void strategyExample() {
        StartStrategyDemo.getStrategy();
    }

    void proxyExample() throws IOException {
        ProxyDemoStarter.startProxyPattern();
    }

    void chainOfResponsibilityExample() {
        ResponsibilityChainDemo.startResponsibilityChain();
    }

    void commandExample() {
        CommandDemo.startCommandDemo();
    }

    void mediatorExample() {
        Main.startMediatorPattern();
    }

    void mementoExample() {
        log.info("There is no example for Memento Method pattern =(");
    }
}
