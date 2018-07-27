package com.epam.lab.mediator;

import org.apache.log4j.Logger;

public class ConcreteColleague1 extends Colleague {
	final static Logger LOG = Logger.getLogger(ConcreteColleague1.class);

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void notify(String message) {
		LOG.info("Colleague1 gets message: " + message);
	}
}
