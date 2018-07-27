package com.epam.lab.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LuxuryCar extends CarDecorator {
	private static final Logger LOG = LogManager.getLogger("com.epam.lab");
	
	public LuxuryCar(Car car){
		super(car);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		LOG.info("Adding features of Luxury Car.");
	}
}

