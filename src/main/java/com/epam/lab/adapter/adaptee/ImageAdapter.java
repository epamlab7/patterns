package src.com.epam.lab.adapter.adaptee;

import src.com.epam.lab.adapter.animation.AnimatedImageViewer;
import src.com.epam.lab.adapter.animation.GifViewer;
import src.com.epam.lab.adapter.image.ImageViewer;

public class ImageAdapter implements ImageViewer {

    private AnimatedImageViewer animatedImageViewer;

    public ImageAdapter (String format) {
        if (format.equalsIgnoreCase(".gif")) {
            animatedImageViewer = new GifViewer();
        }
    }

    @Override
    public void watchImage(String name, String format) {
        if (format.equalsIgnoreCase(".gif")) {
            animatedImageViewer.watchGif(name);
        }
    }
}
