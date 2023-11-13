
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        /*Car car=new Car();
        car.speedUp(20);
        Bicycle bicycle= new Bicycle();
        bicycle.speedUp(24);*/

        List <Vehicle> vehicleList= new ArrayList<>();

        vehicleList.add(new Car("BMW", "X5"));
        vehicleList.add(new Bicycle("Mercedes", "S1"));
        vehicleList.add(new Car("audi", "a5"));

        for (Vehicle vehicul : vehicleList) {
            System.out.println("Marca: " + vehicul.getMarca() + ", Model: " + vehicul.getModel());
        }

    }
}