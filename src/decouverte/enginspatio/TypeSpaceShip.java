package decouverte.enginspatio;

public enum TypeSpaceShip {
    CHASSEUR("Chasseur"),
    FREGATE("Frégate"),
    CROISEUR("Croiseur"),
    CARGO("Cargo"),
    VAISSEAU_MONDE("Vaisseau-Monde");

    public String name;

    TypeSpaceShip(String type) {
        this.name = type;
    }

    // Méthode pour obtenir le TypeSpaceShip par nom
    public static TypeSpaceShip fromName(String name) {
        for (TypeSpaceShip type : TypeSpaceShip.values()) {
            if (type.name.equalsIgnoreCase(name)) { // Ignore la casse pour plus de flexibilité
                return type;
            }
        }
        throw new IllegalArgumentException("Type de vaisseau inconnu : " + name);
    }
}
