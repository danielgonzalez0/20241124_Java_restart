package decouverte.enginspatio;

public abstract class Spaceship {
    private final TypeSpaceShip shipType;
    private int nbPassenger;
    private int blindage;
    private int shieldResistance;
    public int tonnageMax = 0;
    protected int currentTonnage = 0;


    public Spaceship(TypeSpaceShip type) {
        this.shipType = type;
    }


    public Spaceship(TypeSpaceShip type, int passengers) {
        this.nbPassenger = passengers;
        this.shipType = type;
    }

    public Spaceship(TypeSpaceShip type, int blindage, int shieldResistance) {
        this.shipType = type;
        this.blindage = blindage;
        this.shieldResistance = shieldResistance;
    }

    public Spaceship(TypeSpaceShip type, int blindage, int shieldResistance, int passengers) {
        this.nbPassenger = passengers;
        this.shipType = type;
        this.blindage = blindage;
        this.shieldResistance = shieldResistance;
    }


    //getter

    public int getNbPassenger() {
        return this.nbPassenger;
    }

    public TypeSpaceShip getShipType() {
        return this.shipType;
    }

    public int getBlindage() {
        return blindage;
    }

    public int getShieldResistance() {
        return shieldResistance;
    }

    //setter

    public void setNbPassenger(int passengers) {
        this.nbPassenger = passengers;
    }

    public void setBlindage(int blindage) {
        this.blindage = blindage;
    }

    public void setShieldResistance(int shieldResistance) {
        this.shieldResistance = shieldResistance;
    }

    public void activeShield() {
        System.out.println("activation du bouclier d'un vaisseau de type " + this.shipType);
    }

    public void desactiveShield() {
        System.out.println("désactivation du bouclier d'un vaisseau de type " + this.shipType);
    }

    public abstract int emporterCargaison(int tonnage);
}
