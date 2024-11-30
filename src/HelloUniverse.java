import com.myclass.Planete;

public class HelloUniverse {

    //tp3 chap 3 structures de contrôles
    public static void displayPeriodEqualToANumberOfPlanet (int nbPlanet) {
        switch (nbPlanet) {
            case 7 -> System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
            case 8 -> System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
            case 9 -> System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
            default -> System.out.printf("Le programme ne peut pas fournir de résultat pour %d\n", nbPlanet);
        }
    }

    //tp4 chap 3 structures de contrôles
    public static void displayParagraphFor () {
        int nb;
        for (nb = 7; nb < 10; nb++) {
            displayPeriodEqualToANumberOfPlanet(nb);
        }
    }

    //tp5 chap 3 structures de contrôles
    public static void displayWhile () {
        int nb = 7;
        while (nb < 10) {
            displayPeriodEqualToANumberOfPlanet(nb);
            nb++;
        }
    }


//tp1 et 2 chap 3 structures de contrôles
    public static int calculNbPlanete(int annee) {
  if(annee < 1600 || annee > 2024) {
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
        if(nbPlanete == 0) {
            String error = "Le programme ne peut pas fournir de résultat pour l'année %d\n";
            System.out.printf(error, annee);
        }else {
            String message = "en %d, les planètes du système solaire était au nombre de : %d \n";
            System.out.printf(message, annee, nbPlanete);
        }
    }

    public static void main (String... args) {
        // chap4 tp3 Instanciation des planètes
        Planete mercure = new Planete();
        mercure.name = "Mercure";
        mercure.diameter = 4880;
        mercure.matter = "tellurique";

        Planete venus = new Planete();
        venus.name = "Vénus";
        venus.diameter = 12104;
        venus.matter = "tellurique";

        Planete terre = new Planete();
        terre.name = "Terre";
        terre.diameter = 12756;
        terre.matter = "tellurique";

        Planete mars = new Planete();
        mars.name = "Mars";
        mars.diameter = 6792;
        mars.matter = "tellurique";

        Planete jupiter = new Planete();
        jupiter.name = "Jupiter";
        jupiter.diameter = 142984;
        jupiter.matter = "gazeuse";

        Planete saturne = new Planete();
        saturne.name = "Saturne";
        saturne.diameter = 120536;
        saturne.matter = "gazeuse";

        Planete uranus = new Planete();
        uranus.name = "Uranus";
        uranus.diameter = 51118;
        uranus.matter = "gazeuse";

        Planete neptune = new Planete();
        neptune.name = "Neptune";
        neptune.diameter = 49528;
        neptune.matter = "gazeuse";


        //chap4 tp4 => afficher des attr non instanciés
        Planete sansNom = new Planete();

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

        mars.welcomeSpaceship(8);
        mars.welcomeSpaceship("FREGATE");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.totalVisitors);

    }//end main
}
