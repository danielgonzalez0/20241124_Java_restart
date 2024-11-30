package com.myclass;

public class Spaceship {
    private String shipType;
    private int nbPassenger;

    public Spaceship(){
        this.nbPassenger = 0;
        this.shipType = "";
    }

    public Spaceship(String type){
        this.nbPassenger = 0;
        this.shipType = type;
    }


    public Spaceship(int passengers){
        this.nbPassenger = passengers;
        this.shipType = "";
    }

    public Spaceship(String type, int passengers){
        this.nbPassenger = passengers;
        this.shipType = type;
    }

    //getter

    public int getNbPassenger(){
        return this.nbPassenger;
    }
    public String getShipType(){
        return this.shipType;
    }

    //setter
    public void setShipType(String type){
        this.shipType = type;
    }
    public void setNbPassenger(int passengers){
        this.nbPassenger = passengers;
    }
}
