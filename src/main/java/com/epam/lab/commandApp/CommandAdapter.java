package com.epam.lab.commandApp;

public class CommandAdapter extends CommandAbstract implements Command {

    public CommandAdapter(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.adapterExample();
    }
}