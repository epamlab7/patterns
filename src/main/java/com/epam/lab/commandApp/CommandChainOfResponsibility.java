package com.epam.lab.commandApp;

public class CommandChainOfResponsibility extends CommandAbstract implements Command {

    public CommandChainOfResponsibility(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.chainOfResponsibilityExample();
    }
}