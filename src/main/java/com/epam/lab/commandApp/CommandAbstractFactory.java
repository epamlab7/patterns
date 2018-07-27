package com.epam.lab.commandApp;

import java.io.IOException;

public class CommandAbstractFactory extends CommandAbstract implements Command {

    public CommandAbstractFactory(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() throws IOException {
        executor.abstractFactoryExample();
    }
}