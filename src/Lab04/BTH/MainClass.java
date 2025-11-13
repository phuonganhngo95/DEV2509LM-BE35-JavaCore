package Lab04.BTH;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager manager = new CustomerManager();

        for (int i = 1; i <= 5; i++) {
            Customer c = new Customer();
            c.input();
            manager.addCustomer(c);
        }

        manager.displayAll();
    }
}

