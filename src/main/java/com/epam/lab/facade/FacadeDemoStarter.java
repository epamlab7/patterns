package com.epam.lab.facade;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FacadeDemoStarter {
	private static final String FACADE_INFO_PATH = "src/main/resources/facade/facade_info.txt";
	private static final Logger LOG = LogManager.getLogger("com.epam.lab");

	public static void startDecoratorDemo(){
		readFile();
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
	
	private static void readFile() {
		try{
			BufferedReader bufferedReader = new BufferedReader(new FileReader(FACADE_INFO_PATH));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				LOG.info(line);
			}
			bufferedReader.close();
		} catch(Exception e){
			LOG.error(e.getMessage());
		}
	}
}
