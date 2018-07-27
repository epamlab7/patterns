package com.epam.lab.commandApp;

public class CommandFactoryMethod extends CommandAbstract implements Command {

    public CommandFactoryMethod(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.factoryMethodExample();
    }
}