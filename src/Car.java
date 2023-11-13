public class Car extends Vehicle {

    public Car(String marca, String model) {
        super(marca, model);
    }
    @Override
    void speedUp(int viteza) {
        int speed=200+viteza;
        System.out.println("Vehiculul este masina si are viteza : "+ speed);
    }
}
