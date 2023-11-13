public abstract class Vehicle {
    private int speed;
    private String model;
    private String marca;

    public Vehicle(String marca, String model) {
        this.marca=marca;
        this.model=model;
    }

    public void setMarca(String marca)
    {
        this.marca=marca;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public String getModel()
    {
        return model;
    }
    abstract void speedUp(int viteza);
}
