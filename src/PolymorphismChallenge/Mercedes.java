package PolymorphismChallenge;

class Mercedes extends Car {
    public Mercedes(String name, int cylinders) {
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


