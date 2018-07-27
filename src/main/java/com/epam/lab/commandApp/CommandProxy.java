package com.epam.lab.commandApp;

import java.io.IOException;

public class CommandProxy extends CommandAbstract implements Command {

    public CommandProxy(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() throws IOException {
        executor.proxyExample();
    }
}