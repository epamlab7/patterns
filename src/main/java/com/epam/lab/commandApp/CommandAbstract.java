package com.epam.lab.commandApp;

public abstract class CommandAbstract {
    Executor executor;

    CommandAbstract(Executor executor) {
        this.executor = executor;
    }
}