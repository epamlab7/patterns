package com.epam.lab.commandApp;

import java.io.IOException;

public class CommandIterator extends CommandAbstract implements Command {

    public CommandIterator(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() throws IOException {
        executor.iteratorExample();
    }
}