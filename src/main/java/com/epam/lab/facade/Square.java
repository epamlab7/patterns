package com.epam.lab.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Square implements Shape {
	private static final Logger LOG = LogManager.getLogger("com.epam.lab");
	
	@Override
	public void draw(){
		LOG.info("Square drawing.");
	}
}

