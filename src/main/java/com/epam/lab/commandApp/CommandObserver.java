package com.epam.lab.commandApp;

public class CommandObserver extends CommandAbstract implements Command {

    public CommandObserver(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.observerExample();
    }
}