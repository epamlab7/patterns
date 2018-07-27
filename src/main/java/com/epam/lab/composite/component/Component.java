package com.epam.lab.composite.component;

public abstract class Component {
	private final String TAB = "\t";
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void display(int deep);

	public abstract void add(Component child);

	public abstract void remove(Component child);

	public abstract Component getChild(int childId);

	protected String calculateIndept(int deep) {
		String indept = new String();
		for (int i = 0; i < deep; i++) {
			indept = indept + TAB;
		}
		return indept;
	}
}
