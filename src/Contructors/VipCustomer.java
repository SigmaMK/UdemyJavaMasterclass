package Contructors;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {
        this("name", "email", 50.80);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 56.20);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
