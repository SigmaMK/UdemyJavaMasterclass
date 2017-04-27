package PolymorphismChallenge;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake (){
        return "Car -> brake()";
    }
}

class Volvo extends Car {
    public Volvo(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Volvo -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Volvo -> accelerate()";
    }

    @Override
    public String brake() {
        return "Volvo -> brake()";
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("----------------------------------");

        Volvo volvo = new Volvo("v90", 6);
        System.out.println(volvo.startEngine());
        System.out.println(volvo.accelerate());
        System.out.println(volvo.brake());

        System.out.println("----------------------------------");

        Tesla tesla = new Tesla("Model X", 6);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());
    }
}
