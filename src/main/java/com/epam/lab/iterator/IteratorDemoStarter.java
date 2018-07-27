package com.epam.lab.iterator;

import com.epam.lab.iterator.container.NameRepository;
import com.epam.lab.iterator.interfaces.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IteratorDemoStarter {
    private static final String ITERATOR_INFO_FILE_PATH = "src/main/resources/iterator/iterator_info.txt";
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");

    public static void startIteratorDemo() throws IOException {
        displayIteratorDescription();
        NameRepository namesRepository = new NameRepository();
        Iterator iterator = namesRepository.getIterator();
//        iterator traverse through names with 'J' first letter
        System.out.println();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            LOG.info("Name : " + name);
        }
    }

    private static void displayIteratorDescription() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ITERATOR_INFO_FILE_PATH));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            LOG.info(line);
        }
    }
}