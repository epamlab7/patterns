package com.epam.lab.composite.leaf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.lab.composite.component.Component;

public class File extends Component {
	private static final Logger logger = LogManager.getLogger(File.class);

	public File(String name) {
		super(name);
	}

	@Override
	public void display(int deep) {
		logger.info(calculateIndept(deep) + name);
	}

	@Override
	public void add(Component child) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Component child) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int childId) {
		throw new UnsupportedOperationException();

	}

}
