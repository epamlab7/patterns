package com.epam.lab.prototype;

import com.epam.lab.prototype.patternLogic.Droid;
import com.epam.lab.prototype.patternLogic.DroidFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class PrototypeDemoStarter {
    private final static Logger LOG = LogManager.getLogger(PrototypeDemoStarter.class);
    static String USER_DIR = "user.dir";
    static String PATH = "\\src\\main\\resources\\prototype\\prototypeOverview";

    public static void startPrototypeDemo() {
        showPatternOverview();

        Droid originalDroid = new Droid("Sphero BB-8", 1000, 120);
        LOG.info("Original " + originalDroid + " HashCode - " + originalDroid.hashCode());

        DroidFactory factory = new DroidFactory(originalDroid);
        Droid copyDroid = factory.makeCopy();
        LOG.info("Cloned " + copyDroid + " HashCode - " + copyDroid.hashCode());
    }

    private static void showPatternOverview() {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(System.getProperty(USER_DIR) + PATH)));
            bufferedReader.lines().forEach(l -> stringBuilder.append(l).append("\n"));
            LOG.info(stringBuilder);
        } catch (FileNotFoundException e) {
            LOG.error("File not found" + e.getMessage());
        }
    }
}