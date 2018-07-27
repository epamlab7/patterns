package com.epam.lab.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommandDemo {
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");
    public static void startCommandDemo() {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));
        LOG.info("Command pattern demo");
        user.startComputer();
        user.resetComputer();
        user.stopComputer();
    }
}
