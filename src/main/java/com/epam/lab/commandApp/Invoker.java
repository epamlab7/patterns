package com.epam.lab.commandApp;


import java.io.IOException;

public class Invoker {
    private Command abstractFactory;
    private Command builder;
    private Command factoryMethod;
    private Command templateMethod;
    private Command prototype;
    private Command observer;
    private Command singleton;
    private Command iterator;
    private Command adapter;
    private Command bridge;
    private Command decorator;
    private Command facade;
    private Command composite;
    private Command strategy;
    private Command proxy;
    private Command chainOfResponsibility;
    private Command command;
    private Command mediator;
    private Command memento;

    public Invoker(Command abstractFactory, Command builder, Command factoryMethod, Command templateMethod, Command prototype,
                   Command observer, Command singleton, Command iterator, Command adapter, Command bridge, Command decorator,
                   Command facade, Command composite, Command strategy, Command proxy, Command chainOfResponsibility,
                   Command command, Command mediator, Command memento) {
        this.abstractFactory = abstractFactory;
        this.builder = builder;
        this.factoryMethod = factoryMethod;
        this.templateMethod = templateMethod;
        this.prototype = prototype;
        this.observer = observer;
        this.singleton = singleton;
        this.iterator = iterator;
        this.adapter = adapter;
        this.bridge = bridge;
        this.decorator = decorator;
        this.facade = facade;
        this.composite = composite;
        this.strategy = strategy;
        this.proxy = proxy;
        this.chainOfResponsibility = chainOfResponsibility;
        this.command = command;
        this.mediator = mediator;
        this.memento = memento;
    }

    public void executeAbstractFactory() throws IOException {
        abstractFactory.execute();
    }

    public void executeBuilder() throws IOException {
        builder.execute();
    }

    public void executeFactoryMethod() throws IOException {
        factoryMethod.execute();
    }

    public void executeTemplateMethod() throws IOException {
        templateMethod.execute();
    }

    public void executePrototype() throws IOException {
        prototype.execute();
    }

    public void executeObserver() throws IOException {
        observer.execute();
    }

    public void executeSingleton() throws IOException {
        singleton.execute();
    }

    public void executeIterator() throws IOException {
        iterator.execute();
    }

    public void executeAdapter() throws IOException {
        adapter.execute();
    }

    public void executeBridge() throws IOException {
        bridge.execute();
    }

    public void executeDecorator() throws IOException {
        decorator.execute();
    }

    public void executeFacade() throws IOException {
        facade.execute();
    }

    public void executeComposite() throws IOException {
        composite.execute();
    }

    public void executeStrategy() throws IOException {
        strategy.execute();
    }

    public void executeProxy() throws IOException {
        proxy.execute();
    }

    public void executeChainOfResponsibility() throws IOException {
        chainOfResponsibility.execute();
    }

    public void executeCommand() throws IOException {
        command.execute();
    }

    public void executeMediator() throws IOException {
        mediator.execute();
    }

    public void executeMemento() throws IOException {
        memento.execute();
    }
}
