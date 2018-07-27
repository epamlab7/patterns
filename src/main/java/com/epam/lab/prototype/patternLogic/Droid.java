package com.epam.lab.prototype.patternLogic;

public class Droid implements Copyable {
    private String name;
    private int damageLevel;
    private int energyLevel;

    public Droid(String name, int damageLevel, int energyLevel) {
        this.name = name;
        this.damageLevel = damageLevel;
        this.energyLevel = energyLevel;
    }

    public Object copyDroid() {
        return new Droid(name, damageLevel, energyLevel);
    }

    @Override
    public String toString() {
        return String.format("Droid: %s, damageLevel - %d, energyLevel - %s", name, damageLevel, energyLevel);
    }
}
