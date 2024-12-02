package com.myclass;

public class CivilSpaceship extends Spaceship {

    private int calculateTonnageMax = switch (this.getShipType()) {
        case "CARGO" -> 500;
        case "VAISSEAU-MONDE" -> 2000;
        default -> 0;
    };

    //constructeurs
    public CivilSpaceship() {
        super();
        this.tonnageMax = calculateTonnageMax;
    }

    public CivilSpaceship(String type) {
        super(type);
        this.tonnageMax = calculateTonnageMax;
    }


    public CivilSpaceship(int passengers) {
        super(passengers);
        this.tonnageMax = calculateTonnageMax;
    }

    public CivilSpaceship(String type, int passengers) {
        super(type, passengers);
        this.tonnageMax = calculateTonnageMax;
    }

    public CivilSpaceship(String type, int blindage, int shieldResistance) {
        super(type, blindage, shieldResistance);
        this.tonnageMax = calculateTonnageMax;
    }

    @Override
    public int emporterCargaison(int tonnage) {
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
