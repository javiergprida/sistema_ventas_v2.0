package org.jgp.system.views;

import org.jgp.system.views.swing.slideshow.Slideshow;



public class IndexProgram {

    private static IndexProgram instance;

    private Slideshow slideShow;

    public static IndexProgram getInstance() {
        if (instance == null) {
            instance = new IndexProgram();
        }
        return instance;
    }

    private IndexProgram() {
    }

    public Slideshow getSlideShow() {
        return slideShow;
    }

    public void setSlideShow(Slideshow slideShow) {
        this.slideShow = slideShow;
    }
}
