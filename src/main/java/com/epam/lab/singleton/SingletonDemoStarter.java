package com.epam.lab.singleton;

import com.epam.lab.singleton.logger.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.*;

public class SingletonDemoStarter {
    private static final String SINGLETON_INFO_FILE_PATH = "src/main/resources/singleton/singleton_info.txt";
    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger("com.epam.lab");

    public static void startSingletonDemo() throws IOException {
        displaySingletonDescription();
        Logger logger = Logger.getLogger();
        logger.addLog("first log");
        logger.addLog("second log");
        createDirectory();
        logger.writeLogsToFile(new File("output/file.log"));
        LOG.info("\nLogs file is successfully created.");
    }

    private static void createDirectory() {
        File file = new File("output");
        if (!file.exists())
            file.mkdir();
    }

    private static void displaySingletonDescription() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(SINGLETON_INFO_FILE_PATH));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            LOG.info(line);
        }
    }
}