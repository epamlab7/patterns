package com.epam.lab.composite;

import com.epam.lab.composite.component.Component;
import com.epam.lab.composite.composite.Folder;
import com.epam.lab.composite.leaf.File;

public class CompositeDemoStarter {
	public void startCompositeDemo() {
		Component folderProject = new Folder("project");
		Component folderSrc = new Folder("src");
		folderSrc.add(new Folder("main"));
		folderProject.add(new Folder(".settings"));
		folderProject.add(folderSrc);
		folderProject.add(new Folder("target"));
		folderProject.add(new File(".classPath"));
		folderProject.add(new File(".project"));
		folderProject.add(new File("pom.xml"));
		folderProject.display(0);
	}
}
