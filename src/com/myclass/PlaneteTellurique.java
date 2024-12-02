package com.myclass;

import com.myinterface.Habitable;

public class PlaneteTellurique extends Planete implements Habitable {

    //attributs statiques et d'instances
    public static String matter = "tellurique";
    public int totalVisitors;
    public Spaceship stockedShip = null;

    //constructeurs
    public PlaneteTellurique(String name) {
        super(name);
    }

    @Override
    public Spaceship welcomeSpaceship(Spaceship spaceshipIn) {

        Spaceship spaceshipOut = null;

        if (this.stockedShip == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        } else {
            System.out.println(" Un vaisseau de type " + this.stockedShip.getShipType() + " doit s'en aller.");
            spaceshipOut = this.stockedShip;
        }

        if (spaceshipIn instanceof WarSpaceship) {
            ((WarSpaceship) spaceshipIn).desactiveWeapon();
        }

        this.totalVisitors += spaceshipIn.getNbPassenger();
        System.out.printf("  Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n", this.name, this.totalVisitors);
        this.stockedShip = spaceshipIn;
        return spaceshipOut;
    }
}
