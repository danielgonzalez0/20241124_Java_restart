public class HelloUniverse {
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
    }
}
