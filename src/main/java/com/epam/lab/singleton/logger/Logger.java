package com.epam.lab.singleton.logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* It's logger imitation. Using this class instance you can add log messages from any point
of the program to a single list and write all of them to a file at once when program finishes.*/
public class Logger {

    private List<String> logs;

    private Logger() {
        this.logs = new ArrayList<>();
    }

    private static class SingletonHelper {
        private static final Logger logger = new Logger();
    }

    public static Logger getLogger() {
        return SingletonHelper.logger;
    }

    public void addLog(String message) {
        logs.add(message + "\n");
    }

    public void writeLogsToFile(File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(file, true));
        for (String log : logs) {
            bufferedWriter.write(log);
            bufferedWriter.flush();
        }
    }
}