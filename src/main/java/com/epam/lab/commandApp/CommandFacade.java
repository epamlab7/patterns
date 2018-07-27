package com.epam.lab.commandApp;

public class CommandFacade extends CommandAbstract implements Command {

    public CommandFacade(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.facadeExample();
    }
}