package com.techreturners.cats;

abstract class CatBehaviour implements Cat{
    boolean sleeping = false;

    private String eatingSound;

    public CatBehaviour( String eatingSound) {
        this.eatingSound = eatingSound;
    } 

    public void goToSleep(){
        sleeping = true;
    }
    public void wakeUp(){
        sleeping = false;
    }
    public boolean isAsleep() {
        return sleeping;
    }

    public String eat() {
        return eatingSound;
    }
}