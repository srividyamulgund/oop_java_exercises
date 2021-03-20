package com.techreturners.cats;

abstract class CatBehaviour implements Cat {
    boolean sleeping = false;

    private String eatingSound;
    private int averageHeight;
    private String setting;

    public CatBehaviour(String eatingSound, int averageHeight, String setting) {
        this.eatingSound = eatingSound;
        this.averageHeight = averageHeight;
        this.setting = setting;
    }

    public void goToSleep() {
        sleeping = true;
    }

    public void wakeUp() {
        sleeping = false;
    }

    public boolean isAsleep() {
        return sleeping;
    }

    public String eat() {
        return eatingSound;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String getSetting() {
        return setting;
    }
}