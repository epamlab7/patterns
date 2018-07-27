package com.epam.lab.commandApp;

public class CommandStrategy extends CommandAbstract implements Command {

    public CommandStrategy(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.strategyExample();
    }
}