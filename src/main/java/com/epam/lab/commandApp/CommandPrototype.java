package com.epam.lab.commandApp;

public class CommandPrototype extends CommandAbstract implements Command {

    public CommandPrototype(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.prototypeExample();
    }
}