import com.espacex.myclass.Car;

public class HelloWorld {
    public static void main(String... args) {
        Car michelCar = new Car();
        michelCar.nbDoor = 3;
        michelCar.isAutomatic = true;
        michelCar.color = "green";

        System.out.println("la voiture est " + michelCar.color + " et dispose de " + michelCar.nbDoor + " portes");

        int newSpeed = michelCar.accelerate();
        System.out.println("La nouvelle vitesse est de " + newSpeed + " km/h");
    }
}
