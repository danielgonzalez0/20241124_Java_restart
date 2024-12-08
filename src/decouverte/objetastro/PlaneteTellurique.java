package decouverte.objetastro;


import decouverte.enginspatio.Spaceship;
import decouverte.enginspatio.WarSpaceship;


public class PlaneteTellurique extends Planete implements Habitable {

    //attributs statiques et d'instances
    public static String matter = "tellurique";
    public int totalVisitors;
    public Spaceship[][] baieAccostage = null;

    //constructeurs
    public PlaneteTellurique(String name, int nbBaie) {
        super(name);
        this.baieAccostage = new Spaceship[2][nbBaie];
        System.out.println("nombre de baie est de : " + this.baieAccostage.length + " pou la planete " + this.name);
    }

    public boolean isFreePlace(Spaceship ship) {

        int indexType = 0;
        switch (ship.getShipType()) {
            case CARGO, VAISSEAU_MONDE -> indexType = 1;
        }

        for (int i = 0; i < this.baieAccostage[indexType].length; i++) {
            if (this.baieAccostage[indexType][i] == null) {
                return true;
            }
        }
        System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
        return false;
    }

    @Override
    public void welcomeSpaceships(Spaceship... spaceships) {


        for (int j = 0; j < spaceships.length; j++) {

            int indexType = 0;
            switch (spaceships[j].getShipType()) {
                case CARGO, VAISSEAU_MONDE -> indexType = 1;
            }
            if (isFreePlace(spaceships[j])) {
                if (spaceships[j] instanceof WarSpaceship) {
                    ((WarSpaceship) spaceships[j]).desactiveWeapon();
                }

                this.totalVisitors += ((Spaceship) spaceships[j]).getNbPassenger();
                for (int i = 0; i < this.baieAccostage[indexType].length; i++) {
                    if (this.baieAccostage[indexType][i] == null) {
                        this.baieAccostage[indexType][i] = spaceships[j];
                        break;
                    }
                }
            }
            System.out.printf("  Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d.\n", this.name, this.totalVisitors);
        }


    }

}
