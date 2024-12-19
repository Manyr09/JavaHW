package lesson3;

public class Car {
    String brand;
    String model;
    int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    void start(){
        System.out.println("Машина поехала");
    }
    void stop(){
        System.out.println("Машина остановилась");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", speed=" + speed +
                '}';
    }
}
