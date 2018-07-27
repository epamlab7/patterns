package src.com.epam.lab.adapter.image;

import org.apache.log4j.Logger;
import src.com.epam.lab.adapter.adaptee.ImageAdapter;

public class PictureViewer implements ImageViewer {

    private static final Logger LOG =  Logger.getLogger(PictureViewer.class.getName());

    @Override
    public void watchImage(String name, String format) {
        switch (format) {
            case (".jpeg"):
                LOG.info("Watching " + name + ".jpeg");
            break;
            case (".png"):
                LOG.info("Watching " + name + ".png");
                break;
            case (".bmp"):
                LOG.info("Watching " + name + ".bmp");
                break;
            case (".gif"):
                ImageAdapter imageAdapter = new ImageAdapter(format);
                imageAdapter.watchImage(name, format);
                break;
            default:
                LOG.info("Format " + format + " not supported");
        }
    }
}
