package com.epam.lab.commandApp;

public class CommandCommand extends CommandAbstract implements Command {

    public CommandCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.commandExample();
    }
}