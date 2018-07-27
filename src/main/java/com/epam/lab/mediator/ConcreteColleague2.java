package com.epam.lab.mediator;

import org.apache.log4j.Logger;

public class ConcreteColleague2 extends Colleague {
	final static Logger LOG = Logger.getLogger(ConcreteColleague2.class);

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void notify(String message) {
		LOG.info("Colleague2 gets message: " + message);
	}
}
