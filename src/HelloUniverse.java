import com.myclass.*;
import com.myenum.TypeSpaceShip;

import java.util.Scanner;

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
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diameter = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Vénus");
        venus.diameter = 12104;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diameter = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diameter = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diameter = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diameter = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diameter = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diameter = 49528;


//        //chap4 tp4 => afficher des attr non instanciés
//        PlaneteGazeuse sansNom = new PlaneteGazeuse("sans nom");
//
//        // Affichage des informations de Jupiter
//        System.out.println(jupiter.name + " est une planète " + jupiter.matter +
//                " avec un diamètre de " + jupiter.diameter + " kilomètres.");


        //chap4 tp5 methodes
        /*neptune.revolution();
        mars.rotation();*/

        //chap4 tp6 methodes + arg
//        int neptuneTurn = mercure.revolution(-3542);
//        System.out.printf(" Neptune a effectué %d tours complets autour de son étoile.\n", neptuneTurn);
//        int marsTurn = mars.rotation(-684);
//        System.out.printf("Mars a effectué %d tours complets sur elle-même\n", marsTurn);
//        int venusTurn = venus.revolution(1250);
//        System.out.printf(" Venus a effectué %d tours complets autour de son étoile.\n", venusTurn);

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
//        uranus.atmosphere = new Atmosphere(83, 15, 2.5F, 0, 0, 0);
//        System.out.printf("Uranus est composée :\n" +
//                        "- d'ydrogène à %.1f%%\n" +
//                        "- d'hélium à %.1f%%\n" +
//                        "- de méthane à %.1f%%\n",
//                uranus.atmosphere.getHydrogen(), uranus.atmosphere.getHelium(), uranus.atmosphere.getMethane());
//        //chap 4 tp 8 passer des obj en arg des méthodes
//        //Faites accoster sur Mars une Frégate de 9 passagers puis un Croiseur de 42 passagers.
//        WarSpaceship fregateA = new WarSpaceship("FREGATE", 9);
//        WarSpaceship croiseurA = new WarSpaceship("croiseur", 42);
//
//        mars.welcomeSpaceship(fregateA);
//        mars.welcomeSpaceship(croiseurA);
//        System.out.println("vaisseau sur mars : " + mars.stockedShip.getShipType());
//
//        //chap 4 tp9 variable de classe ou prop statique
//        System.out.println("la forme d'une planète est " + Planete.form);
//        System.out.println("la forme de Mars est " + mars.form);
//
//        //chap 4 tp10 méthode statique
//        System.out.println(Planete.expansion(10.5));
//        System.out.println(Planete.expansion(14.2));

        //chap 4 tp11 constructeur par défault
//        System.out.println("nb de planètes découvertes: " + Planete.nbPlanetesDecouvertes);

        //chap 5 tp1 extends
//        Spaceship chasseurA = new WarSpaceship("CHASSEUR", 156, 2);
//
//        Spaceship vaisseauMondeA = new CivilSpaceship("VAISSEAU-MONDE", 4784, 30);
//
//        vaisseauMondeA.activeShield();
//        ((WarSpaceship) chasseurA).attack(vaisseauMondeA, "lasers photoniques", 3);
//        vaisseauMondeA.desactiveShield();
//        System.out.println("le blindage du vaisseau-monde est de " + vaisseauMondeA.getBlindage());
//        System.out.println("son shield peut resister encore " + vaisseauMondeA.getShieldResistance() + " minutes");
//
//        mars.welcomeSpaceship(vaisseauMondeA);
//        mars.welcomeSpaceship(chasseurA);

//        System.out.println("----------------------------- chap5 tp final classe abstraite --------------------------------------");
//        WarSpaceship chasseurB = new WarSpaceship("CHASSEUR", 50, 200, 10);
//        int reject = chasseurB.emporterCargaison(20);
//        System.out.println("la quantité refusée du chasseur b est de : " + reject);
//
//        WarSpaceship fregateB = new WarSpaceship("FREGATE", 100);
//        reject = fregateB.emporterCargaison(45);
//        System.out.println("la quantité refusée de la fregate b est de : " + reject);
//        reject = fregateB.emporterCargaison(12);
//        System.out.println("la quantité refusée de la fregate b est de : " + reject);
//
//        WarSpaceship fregateC = new WarSpaceship("FREGATE", 14);
//        reject = fregateC.emporterCargaison(30);
//        System.out.println("la quantité refusée de la fregate c est de : " + reject);
//
//        CivilSpaceship vaisseauMondeB = new CivilSpaceship("VAISSEAU-MONDE");
//        reject = vaisseauMondeB.emporterCargaison(1560);
//        System.out.println("la quantité refusée du baisseau-monde B est de : " + reject);
//        reject = vaisseauMondeB.emporterCargaison(600);
//        System.out.println("la quantité refusée du baisseau-monde B est de : " + reject);
//
//        System.out.println("----------------------------- chap5 tp final classe abstraite --------------------------------------");
        System.out.println("----------------------------- chap6 tp1 class scanner --------------------------------------");

        WarSpaceship chasseurC = new WarSpaceship(TypeSpaceShip.CHASSEUR, 20, 100, 12);
        WarSpaceship fregateC = new WarSpaceship(TypeSpaceShip.FREGATE, 30, 150, 2);
        WarSpaceship croiseurC = new WarSpaceship(TypeSpaceShip.CROISEUR, 35, 200, 22);
        CivilSpaceship cargoC = new CivilSpaceship(TypeSpaceShip.CARGO, 200, 1000, 100);
        CivilSpaceship vaisseauMondeC = new CivilSpaceship(TypeSpaceShip.VAISSEAU_MONDE, 300, 2000, 500);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaisseau souhaitez-vous manipuler: " + TypeSpaceShip.CHASSEUR.name + ", Frégate, Croiseur, Cargo et Vaisseau-Monde");

        String stringType = sc.nextLine();
        TypeSpaceShip spaceshipType = TypeSpaceShip.fromName(stringType);


        Spaceship spaceshipSelected = null;
        switch (spaceshipType) {
            case CHASSEUR -> spaceshipSelected = chasseurC;
            case FREGATE -> spaceshipSelected = fregateC;
            case CROISEUR -> spaceshipSelected = croiseurC;
            case CARGO -> spaceshipSelected = cargoC;
            case VAISSEAU_MONDE -> spaceshipSelected = vaisseauMondeC;
            default -> {
                System.out.println("une erreur c'est produite sur le choix du vaisseau");
                System.exit(1);
            }
        }

        System.out.println("sur quelle planete tellurique voulez-vous attérir: mercure, venus, terre, mars");
        String planeteName = sc.nextLine();
        PlaneteTellurique planeteChoisi = null;
        switch (planeteName) {
            case "mercure" -> planeteChoisi = mercure;
            case "venus" -> planeteChoisi = venus;
            case "terre" -> planeteChoisi = terre;
            case "mars" -> planeteChoisi = mars;
            default -> {
                System.out.println("une erreur c'est produite sur le choix de la planete");
                System.exit(1);
            }
        }

        System.out.println("quel tonnage voulez-vous embarquer");
        int tonnageChoisi = sc.nextInt();

        planeteChoisi.welcomeSpaceship(spaceshipSelected);
        System.out.println(spaceshipSelected.getShipType() + " a rejeté : " + spaceshipSelected.emporterCargaison(tonnageChoisi) + " tonnes");


        System.out.println("----------------------------- chap6 tp2 class classes conteneur --------------------------------------");
        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.hydrogen = 83f;
        atmosphereUranus.helium = 15f;
        atmosphereUranus.methane = new Float(2.5f);
        atmosphereUranus.argon = new Float(0);

        if (atmosphereUranus.hydrogen != null)
            System.out.println(" uranus hydrogen = " + atmosphereUranus.hydrogen + "%");
        if (atmosphereUranus.methane != null) System.out.println(" uranus methane = " + atmosphereUranus.methane + "%");
        if (atmosphereUranus.helium != null) System.out.println(" uranus helium = " + atmosphereUranus.helium + "%");
        if (atmosphereUranus.argon != null) System.out.println(" uranus argon = " + atmosphereUranus.argon + "%");
        if (atmosphereUranus.carbonDioxide != null)
            System.out.println(" uranus dioxyde de carbone = " + atmosphereUranus.carbonDioxide + "%");
        if (atmosphereUranus.sodium != null) System.out.println(" uranus sodium = " + atmosphereUranus.sodium + "%");


        System.out.println("----------------------------- chap6 tp3 class un type enum --------------------------------------");


    }//end main
}
