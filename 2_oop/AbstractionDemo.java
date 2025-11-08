abstract class Car {
    protected String brand;
    protected String model;

    abstract void getBrand();

    abstract void getModel();
}

class Tata extends Car {
    Tata(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    void getBrand() {
        System.out.println("Brand is " + this.brand);
    }

    @Override
    void getModel() {
        System.out.println("Model is " + this.model);
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {
        Car car = new Tata("Tata", "Nano");
        car.getBrand();
        car.getModel();
    }
}
