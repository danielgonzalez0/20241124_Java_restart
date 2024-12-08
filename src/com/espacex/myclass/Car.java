package com.espacex.myclass;

public class Car {
    public int nbDoor = 5;
    public boolean isAutomatic = false;
    public String color;
    public int currentGear;


    //méthodes
    public void honk() {
        System.out.println("tuututt!!");
    }

    public int accelerate() {
        System.out.println("J'accélère");
        return 100;
    }

    public int changeGear(boolean up) {
        if (up) {
            this.currentGear++;
        } else {
            this.currentGear--;
        }
        return this.currentGear;
    }
}
