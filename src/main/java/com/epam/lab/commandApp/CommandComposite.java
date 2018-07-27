package com.epam.lab.commandApp;

public class CommandComposite extends CommandAbstract implements Command {

    public CommandComposite(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.compositeExample();
    }
}