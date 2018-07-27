package com.epam.lab.commandApp;

public class CommandMemento extends CommandAbstract implements Command {

    public CommandMemento(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.mementoExample();
    }
}