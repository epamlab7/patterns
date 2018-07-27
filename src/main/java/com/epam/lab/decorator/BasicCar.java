package com.epam.lab.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicCar implements Car {
	private static final Logger LOG = LogManager.getLogger("com.epam.lab");
	
	@Override
	public void assemble() {
		LOG.info("Basic Car.");
	}

}
