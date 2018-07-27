package com.epam.lab.decorator;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DecoratorDemoStarter {
	
	private static final String DECORATOR_INFO_PATH = "src/main/resources/decorator/decorator_info.txt";
	private static final Logger LOG = LogManager.getLogger("com.epam.lab");
	
	public static void startDecoratorDemo() {
		readFile();
		Car basicCar = new BasicCar();
		Car sportsCar = new SportsCar(basicCar);
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(basicCar));
		basicCar.assemble();
		LOG.info("------------");
		sportsCar.assemble();
		LOG.info("------------");
		sportsLuxuryCar.assemble();
	}
	
	private static void readFile() {
		try{
			BufferedReader bufferedReader = new BufferedReader(new FileReader(DECORATOR_INFO_PATH));
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
