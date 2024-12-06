import com.myclass.*;
import com.myenum.TypeSpaceShip;

import java.util.Map;
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


        Galaxie systemeSolaire = new Galaxie("systeme solaire");

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diameter = 120536;
        saturne.distanceEtoile = 1427f;
        systemeSolaire.planetes.add(saturne);

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diameter = 51118;
        uranus.distanceEtoile = 2877.38f;
        systemeSolaire.planetes.add(uranus);

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diameter = 49528;
        neptune.distanceEtoile = 4497.07f;
        systemeSolaire.planetes.add(neptune);

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 5);
        mercure.diameter = 4880;
        mercure.distanceEtoile = 57.9f;
        systemeSolaire.planetes.add(mercure);

        PlaneteTellurique venus = new PlaneteTellurique("Vénus", 0);
        venus.diameter = 12104;
        venus.distanceEtoile = 108.2f;
        systemeSolaire.planetes.add(venus);

        PlaneteTellurique terre = new PlaneteTellurique("Terre", 100);
        terre.diameter = 12756;
        terre.distanceEtoile = 149.6f;
        systemeSolaire.planetes.add(terre);

        PlaneteTellurique mars = new PlaneteTellurique("Mars", 1);
        mars.diameter = 6792;
        mars.distanceEtoile = 227.9f;
        systemeSolaire.planetes.add(mars);


        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diameter = 142984;
        jupiter.distanceEtoile = 778.3f;
        systemeSolaire.planetes.add(jupiter);

        System.out.println("Les planètes du système solaire dans l'ordre de distance avec le soleil sont :");
        for (Planete planete : systemeSolaire.planetes) {
            System.out.println(planete.name);
        }


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

//        terre.welcomeSpaceships(cargoC, chasseurC, croiseurC, fregateC);

        Atmosphere atmosphereMars = new Atmosphere();
        atmosphereMars.constituants.put("CO2", 95f);
        atmosphereMars.constituants.put("N2", 3f);
        atmosphereMars.constituants.put("AR", 1.5f);
        System.out.println("l'atmosphere de mars est composé de :");
        for (Map.Entry<String, Float> gaz : atmosphereMars.constituants.entrySet()) {
            System.out.println(gaz.getValue() + "% de   " + gaz.getKey());
        }


        while (true) {
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

            System.out.println("sur quelle planete tellurique voulez-vous attérir: mercure (1), venus (2) , terre (3), mars(4)");
            String planeteIndex = sc.nextLine();
            Planete planeteChoisi = null;


            for (Planete planete : systemeSolaire.planetes) {
                if (planete.name.equalsIgnoreCase(planeteIndex)) {
                    planeteChoisi = planete;
                    break;
                }
            }

            if (planeteChoisi instanceof PlaneteGazeuse) {
                System.out.println("Il ne s'agit pas d'une planète Tellurique !");
                continue;
            }

            System.out.println("quel tonnage voulez-vous embarquer");
            int tonnageChoisi = sc.nextInt();

            ((PlaneteTellurique) planeteChoisi).welcomeSpaceships(spaceshipSelected);
            System.out.println(spaceshipSelected.getShipType() + " a rejeté : " + spaceshipSelected.emporterCargaison(tonnageChoisi) + " tonnes");
            sc.nextLine();
            System.out.println("Voulez-vous continuez? oui/non");

            String res = sc.nextLine();
            if (res.equals("non")) {
                System.out.println("A binetot");
                break;
            }
            if (!res.equals("oui") && !res.equals("non")) {
                System.out.println("une erreur est survenue");
                break;
            }
        }


//        System.out.println("----------------------------- chap6 tp2 class classes conteneur --------------------------------------");


//        System.out.println("----------------------------- chap6 tp3 class un type enum --------------------------------------");


    }//end main
}
