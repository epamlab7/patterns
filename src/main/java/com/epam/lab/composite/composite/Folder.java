package com.epam.lab.composite.composite;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.lab.composite.component.Component;
import com.epam.lab.composite.leaf.File;

public class Folder extends Component {
	private static final Logger logger = LogManager.getLogger(File.class);
	private final String FOLDER_MARK = "> ";
	private List<Component> children;

	public Folder(String name) {
		super(name);
		children = new ArrayList<>();
	}

	@Override
	public void display(int deep) {
		logger.info(calculateIndept(deep) + FOLDER_MARK + name);
		for (Component component : children) {
			component.display(deep + 1);
		}
	}

	@Override
	public void add(Component child) {
		children.add(child);
	}

	@Override
	public void remove(Component child) {
		children.remove(child);
	}

	@Override
	public Component getChild(int childId) {
		return children.get(childId);

	}

}
