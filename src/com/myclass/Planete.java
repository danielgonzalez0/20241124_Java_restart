package com.myclass;

import java.util.Objects;

public abstract class Planete implements Comparable<Object> {
    public static String form = "sphérique";
    public static int nbPlanetesDecouvertes = 0;

    public String name;
    public long diameter;
    public Atmosphere atmosphere;
    public float distanceEtoile;

    //constructeurs par défaut
    public Planete(String name) {
        this.name = name;
        this.nbPlanetesDecouvertes++;
    }

    //méthodes

    //static

    public static String expansion(double distance) {
        if (distance < 14) return "Oh la la mais c'est super rapide";
        return "Je rêve ou c'est plus rapide que la lumiere";
    }


    //d'instances

    public int revolution(int angle) {
        System.out.printf("Je suis la planète %S et je tourne autour de mon étoile\n", this.name);
        int result = angle / 360;
        return result;
    }

    public int rotation(int angle) {
        System.out.printf("Je suis la planète %S et je tourne sur moi-même\n", this.name);
        int result = angle / 360;
        return result;
    }

    public int compareTo(Object Planete) {
        Planete planeteToCompare = (Planete) Planete;
        return ((Float) distanceEtoile).compareTo(planeteToCompare.distanceEtoile);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Planete planete)) return false;
        return Float.compare(distanceEtoile, planete.distanceEtoile) == 0 && Objects.equals(name, planete.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceEtoile);
    }

//chap 4 tp 7 surcharge de méthodes
//    public void welcomeSpaceship (int newVisitors){
//        this.totalVisitors = this.totalVisitors + newVisitors;
//    }
//
//    public void welcomeSpaceship (String spaceshipType){
//
//        int newVisitors = switch (spaceshipType) {
//            case "CHASSEUR" -> 3;
//            case "FREGATE" -> 12;
//            case "CROISEUR" -> 50;
//            default -> 0;
//        };
//
//        this.totalVisitors = this.totalVisitors + newVisitors;
//    }
//
//    //chap 4 tp 8 passer des obj en arg des méthodes
//    public Spaceship welcomeSpaceship(Spaceship spaceshipIn) {
//
//        Spaceship spaceshipOut = null;
//
//        if (this.stockedShip == null) {
//            System.out.println("Aucun vaisseau ne s'en va");
//        } else {
//            System.out.println(" Un vaisseau de type " + this.stockedShip.getShipType() + " doit s'en aller.");
//            spaceshipOut = this.stockedShip;
//        }
//        this.totalVisitors += spaceshipIn.getNbPassenger();
//        System.out.printf("  Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n", this.name, this.totalVisitors);
//        this.stockedShip = spaceshipIn;
//        return spaceshipOut;
//    }
}
