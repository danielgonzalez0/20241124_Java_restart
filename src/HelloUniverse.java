public class HelloUniverse {
    public static void displayPeriodEqualToANumberOfPlanet (int nbPlanet) {
        switch (nbPlanet) {
            case 7 -> System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
            case 8 -> System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
            case 9 -> System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
            default -> System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanet);
        }
    }

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
        message(1599);
        message(1600);
        message(1700);
        message(1800);
        message(2006);
        message(2024);
        message(2025);

        displayPeriodEqualToANumberOfPlanet(7);
        displayPeriodEqualToANumberOfPlanet(8);
        displayPeriodEqualToANumberOfPlanet(9);
        displayPeriodEqualToANumberOfPlanet(14);
    }
}
