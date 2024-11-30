import com.myclass.Atmosphere;
import com.myclass.Planete;
import com.myclass.Spaceship;

public class HelloUniverse {

    //tp3 chap 3 structures de contrôles
    public static void displayPeriodEqualToANumberOfPlanet(int nbPlanet) {
        switch (nbPlanet) {
            case 7 -> System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
            case 8 ->
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
            case 9 ->
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
            default -> System.out.printf("Le programme ne peut pas fournir de résultat pour %d\n", nbPlanet);
        }
    }

    //tp4 chap 3 structures de contrôles
    public static void displayParagraphFor() {
        int nb;
        for (nb = 7; nb < 10; nb++) {
            displayPeriodEqualToANumberOfPlanet(nb);
        }
    }

    //tp5 chap 3 structures de contrôles
    public static void displayWhile() {
        int nb = 7;
        while (nb < 10) {
            displayPeriodEqualToANumberOfPlanet(nb);
            nb++;
        }
    }


    //tp1 et 2 chap 3 structures de contrôles
    public static int calculNbPlanete(int annee) {
        if (annee < 1600 || annee > 2024) {
            return 0;
        } else if (annee < 1700) {
            return 7;
        } else if (annee < 1800) {
            return 8;
        } else if (annee < 2006) {
            return 9;
        } else {
            return 8;
        }
    }

    public static void message(int annee) {
        int nbPlanete = calculNbPlanete(annee);
        if (nbPlanete == 0) {
            String error = "Le programme ne peut pas fournir de résultat pour l'année %d\n";
            System.out.printf(error, annee);
        } else {
            String message = "en %d, les planètes du système solaire était au nombre de : %d \n";
            System.out.printf(message, annee, nbPlanete);
        }
    }

    public static void main(String... args) {
        // chap4 tp3 Instanciation des planètes
        Planete mercure = new Planete("Mercure");
        mercure.diameter = 4880;
        mercure.matter = "tellurique";

        Planete venus = new Planete("Vénus");
        venus.diameter = 12104;
        venus.matter = "tellurique";

        Planete terre = new Planete("Terre");
        terre.diameter = 12756;
        terre.matter = "tellurique";

        Planete mars = new Planete("Mars");
        mars.diameter = 6792;
        mars.matter = "tellurique";

        Planete jupiter = new Planete("Jupiter");
        jupiter.diameter = 142984;
        jupiter.matter = "gazeuse";

        Planete saturne = new Planete("Saturne");
        saturne.diameter = 120536;
        saturne.matter = "gazeuse";

        Planete uranus = new Planete("Uranus");
        uranus.diameter = 51118;
        uranus.matter = "gazeuse";

        Planete neptune = new Planete("Neptune");
        neptune.diameter = 49528;
        neptune.matter = "gazeuse";


        //chap4 tp4 => afficher des attr non instanciés
        Planete sansNom = new Planete("sans nom");

        // Affichage des informations de Jupiter
        System.out.println(jupiter.name + " est une planète " + jupiter.matter +
                " avec un diamètre de " + jupiter.diameter + " kilomètres.");

        System.out.println(sansNom.name + " est une planète " + sansNom.matter +
                " avec un diamètre de " + sansNom.diameter + " kilomètres.");

        //chap4 tp5 methodes
        /*neptune.revolution();
        mars.rotation();*/

        //chap4 tp6 methodes + arg
        int neptuneTurn = mercure.revolution(-3542);
        System.out.printf(" Neptune a effectué %d tours complets autour de son étoile.\n", neptuneTurn);
        int marsTurn = mars.rotation(-684);
        System.out.printf("Mars a effectué %d tours complets sur elle-même\n", marsTurn);
        int venusTurn = venus.revolution(1250);
        System.out.printf(" Venus a effectué %d tours complets autour de son étoile.\n", venusTurn);

        //chap 4 tp 7 surcharge de méthodes
        /*
         * Dans le main , faites accoster sur Mars un convoi de 8 êtres humains, suivi d'une Frégate.
         * Affichez ensuite le nombre d'être humains finalement comptabilisés sur Mars sous la forme :
         * Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de 20.
         * */
//
//        mars.welcomeSpaceship(8);
//        mars.welcomeSpaceship("FREGATE");
//        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.totalVisitors);

        //chap4 tp8 attri class sous forme d'objet
        uranus.atmosphere = new Atmosphere(83, 15, 2.5F, 0, 0, 0);
        System.out.printf("Uranus est composée :\n" +
                        "- d'ydrogène à %.1f%%\n" +
                        "- d'hélium à %.1f%%\n" +
                        "- de méthane à %.1f%%\n",
                uranus.atmosphere.getHydrogen(), uranus.atmosphere.getHelium(), uranus.atmosphere.getMethane());
        //chap 4 tp 8 passer des obj en arg des méthodes
        //Faites accoster sur Mars une Frégate de 9 passagers puis un Croiseur de 42 passagers.
        Spaceship fregateA = new Spaceship("FREGATE", 9);
        Spaceship croiseurA = new Spaceship("croiseur", 42);

        mars.welcomeSpaceship(fregateA);
        mars.welcomeSpaceship(croiseurA);
        System.out.println("vaisseau sur mars : " + mars.stockedShip.getShipType());

        //chap 4 tp9 variable de classe ou prop statique
        System.out.println("la forme d'une planète est " + Planete.form);
        System.out.println("la forme de Mars est " + mars.form);

        //chap 4 tp10 méthode statique
        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        //chap 4 tp11 constructeur par défault
        System.out.println("nb de planètes découvertes: " + Planete.nbPlanetesDecouvertes);

    }//end main
}
