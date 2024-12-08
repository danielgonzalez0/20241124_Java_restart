package decouverte.objetastro;

import java.util.Set;
import java.util.TreeSet;

public class Galaxie {
    public String name;
    public Set<Planete> planetes = new TreeSet<Planete>();

    public Galaxie(String name) {
        this.name = name;
    }
}
