package com.epam.lab.commandApp;

import java.io.IOException;

public class CommandSingleton extends CommandAbstract implements Command {
    public CommandSingleton(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() throws IOException {
        executor.singletonExample();
    }
}
