package com.epam.lab.commandApp;

public class CommandDecorator extends CommandAbstract implements Command {

    public CommandDecorator(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.decoratorExample();
    }
}