package com.myclass;

import com.myenum.TypeSpaceShip;

public class WarSpaceship extends Spaceship {
    public boolean isWeaponActivated = true;

    private int calculateTonnageMax = switch (this.getShipType()) {
        case CHASSEUR -> 0;
        case FREGATE -> Math.min(this.getNbPassenger() * 2, 50);
        case CROISEUR -> Math.min(this.getNbPassenger() * 2, 100);
        default -> 0;
    };

    //constructeurs
    public WarSpaceship() {
        super();
    }

    public WarSpaceship(TypeSpaceShip type) {
        super(type);
    }


    public WarSpaceship(int passengers) {
        super(passengers);
        this.tonnageMax = calculateTonnageMax;
    }

    public WarSpaceship(TypeSpaceShip type, int passengers) {
        super(type, passengers);
        this.tonnageMax = calculateTonnageMax;
    }

    public WarSpaceship(TypeSpaceShip type, int blindage, int shieldResistance, int passengers) {
        super(type, blindage, shieldResistance, passengers);
        this.tonnageMax = calculateTonnageMax;
    }


    //method

    public void attack(Spaceship targetShip, String weapon, int attackDuration) {
        if (this.isWeaponActivated) {
            System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes.\n",
                    this.getShipType(), targetShip.getShipType(), weapon, attackDuration);
            targetShip.setShieldResistance(0);
            targetShip.setBlindage(targetShip.getBlindage() / 2);
        } else {
            System.out.println("attaque impossible, armement désactivé");
        }
    }

    public void desactiveWeapon() {
        this.isWeaponActivated = false;
        System.out.println("armes désactivées pour le vaisseau de type " + this.getShipType());
    }

    public void activeWeapon() {
        this.isWeaponActivated = true;
        System.out.println("armes activées pour le vaisseau de type " + this.getShipType());
    }

    @Override
    public void activeShield() {
        this.desactiveWeapon();
        System.out.println("activation du bouclier d'un vaisseau de type " + this.getShipType());
    }

    @Override
    public void desactiveShield() {
        this.activeWeapon();
        System.out.println("désactivation du bouclier d'un vaisseau de type " + this.getShipType());
    }

    @Override
    public int emporterCargaison(int tonnage) {
        if (this.getNbPassenger() < 12) return tonnage;

        int current = this.currentTonnage + tonnage;

        if (current >= this.tonnageMax) {
            int rejected = current - this.tonnageMax;
            this.currentTonnage = this.tonnageMax;
            return rejected;
        } else {
            this.currentTonnage += current;
            return 0;
        }
    }
}
