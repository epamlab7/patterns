package com.epam.lab.commandApp;

public class CommandBuilder extends CommandAbstract implements Command {

    CommandBuilder(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.builderExample();
    }
}