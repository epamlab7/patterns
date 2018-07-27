package src.com.epam.lab.adapter.animation;

import org.apache.log4j.Logger;

public class GifViewer implements AnimatedImageViewer {

    private static final Logger LOG =  Logger.getLogger(GifViewer.class.getName());

    @Override
    public void watchGif(String name) {
        LOG.info("Watching " + name + ".gif");
    }
}
