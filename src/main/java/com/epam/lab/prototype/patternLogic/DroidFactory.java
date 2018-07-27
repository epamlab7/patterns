package com.epam.lab.prototype.patternLogic;

public class DroidFactory {
    private Droid droid;

    public DroidFactory(Droid droid) {
        setProperty(droid);
    }

    private void setProperty(Droid droid) {
        this.droid = droid;
    }

    public Droid makeCopy() {
        return (Droid) droid.copyDroid();
    }
}
