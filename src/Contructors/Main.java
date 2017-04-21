package Contructors;

public class Main {

    public static void main(String[] args) {

        BankAccount marthasAccount = new BankAccount("564987123", 0.00, "Martha Andersson" ,
                                                        "martha@martha.se", "070256456");

        System.out.println("Account number:" + marthasAccount.getAccountNumber());
        System.out.println("Account balance: " + marthasAccount.getBalance());
        System.out.println("Customer name: " + marthasAccount.getCustomerName());
        System.out.println("Customer e-mail: " + marthasAccount.getEmail());
        System.out.println("Customer phone number: " + marthasAccount.getPhoneNumber());


        /*marthasAccount.withdrawal(100.0);

        marthasAccount.deposit(50.0);
        marthasAccount.withdrawal(100.0);

        marthasAccount.deposit(200.0);
        marthasAccount.withdrawal(100.0);*/



    }
}
