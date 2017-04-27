package PolymorphismChallenge;

class Tesla extends Car {
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Tesla -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Tesla -> accelerate()";
    }

    @Override
    public String brake() {
        return "Tesla -> brake()";
    }
}


