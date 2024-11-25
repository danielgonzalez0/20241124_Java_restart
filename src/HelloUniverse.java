public class HelloUniverse {
    public static int calculNbPlanete(int annee) {
        if(annee < 2006) {
            return 9;
        } else {
            return  8;
        }
    }

    public static void message(int annee) {
        int nbPlanete = calculNbPlanete(annee);
        System.out.printf("en %d, les planètes du système solaire était au nombre de : %d \n", annee, nbPlanete);
    }

    public static void main (String... args) {
        message(2003);
        message(2014);
        message(2006);
    }
}
