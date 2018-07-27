package com.epam.lab.proxy;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealInternet implements Internet {
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");

    @Override
    public void connectTo(String url) throws Exception {
        LOG.info("Connecting to " + url);
    }
}


