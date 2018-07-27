package com.epam.lab.commandApp;

public class CommandMediator extends CommandAbstract implements Command {

    public CommandMediator(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.mediatorExample();
    }
}