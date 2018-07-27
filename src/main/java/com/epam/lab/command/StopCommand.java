package com.epam.lab.command;

//concrete command
public class StopCommand implements Command {
    private Computer computer;

    StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
