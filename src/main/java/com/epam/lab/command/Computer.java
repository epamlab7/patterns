package com.epam.lab.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//receiver
class Computer {
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");
    void start() {
        LOG.info("Start");
    }

    void stop() {
        LOG.info("Stop");
    }

    void reset() {
        LOG.info("Reset");
    }
}