package com.epam.lab.commandApp;

public class CommandBridge extends CommandAbstract implements Command {

    public CommandBridge(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.bridgeExample();
    }
}
