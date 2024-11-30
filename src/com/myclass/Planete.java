package com.myclass;

public class Planete {
public String name;
public String matter;
public long diameter;
public int totalVisitors;

//méthodes
    public int revolution (int angle) {
        System.out.printf("Je suis la planète %S et je tourne autour de mon étoile\n", this.name);
        int result = angle / 360;
        return result;
    }

    public int rotation (int angle) {
        System.out.printf("Je suis la planète %S et je tourne sur moi-même\n", this.name);
        int result = angle / 360;
        return result;
    }

    //chap 4 tp 7 surcharge de méthodes
    public void welcomeSpaceship (int newVisitors){
        this.totalVisitors = this.totalVisitors + newVisitors;
    }

    public void welcomeSpaceship (String spaceshipType){

        int newVisitors = switch (spaceshipType) {
            case "CHASSEUR" -> 3;
            case "FREGATE" -> 12;
            case "CROISEUR" -> 50;
            default -> 0;
        };

        this.totalVisitors = this.totalVisitors + newVisitors;
    }

}
