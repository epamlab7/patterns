package com.epam.lab.adapter;

import org.apache.log4j.Logger;
import src.com.epam.lab.adapter.image.PictureViewer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StartAdapterPattern {

    private static final String FILENAME = "src/main/resources/adapter_info.txt";
    private static Logger LOG = Logger.getLogger(StartAdapterPattern.class.getName());

    public void startAdapterPattern() {
        scanFileInformation(FILENAME);

        PictureViewer pictureViewer = new PictureViewer();

        pictureViewer.watchImage("pngformat", ".png");
        pictureViewer.watchImage("jpegformat", ".jpeg");
        pictureViewer.watchImage("bmpformat",".bmp");
        pictureViewer.watchImage("gifformat",".gif");
        pictureViewer.watchImage("jpgformat",".jpg");
    }

    public void scanFileInformation(String fileName) {
        String line;
        try (Scanner scan = new Scanner(new File(fileName))){
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                LOG.info(line);
            }
        } catch (FileNotFoundException ex) {
            LOG.error("File was not found. Make sure the file exist. " + ex);
        }
    }
}
