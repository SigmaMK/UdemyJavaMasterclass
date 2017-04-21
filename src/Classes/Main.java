package Classes;

import Contructors.VipCustomer;

public class Main {

    public static void main(String[] args) {

        Car tesla = new Car();

        tesla.setModel("Model 3");
        System.out.println("Model is " + tesla.getModel());

        VipCustomer person = new VipCustomer();
        System.out.println(person.getName());

        VipCustomer person2 = new VipCustomer("Malcolm", "malcolm@malcolm.se");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim","tima@tim.se",50.00);
        System.out.println(person3.getName());


    }
}
