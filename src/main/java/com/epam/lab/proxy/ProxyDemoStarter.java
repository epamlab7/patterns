package com.epam.lab.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProxyDemoStarter {
    private static final String PROXY_INFO_FILE_PATH = "src/main/resources/proxy/proxy_info.txt";
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");

    public static void main(String[] args) {
        try {
            startProxyPattern();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startProxyPattern() throws IOException {
        displayProxyDescription();
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("site.com");
            internet.connectTo("bannedSite.com");
        }catch (Exception e){
            LOG.info(e.getMessage());
        }
    }

    private static void displayProxyDescription() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(PROXY_INFO_FILE_PATH));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            LOG.info(line);
        }
    }
}


