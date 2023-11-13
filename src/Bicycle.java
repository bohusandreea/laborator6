public class Bicycle extends Vehicle {

    public Bicycle(String marca, String model) {
        super(marca, model);
    }
    @Override
    void speedUp(int viteza) {
        int speed=200+viteza;
        System.out.println("Vehiculul este bicicleta si are viteza : "+ speed);
    }
}
