package Lab04.BTH;

import java.util.ArrayList;

public class CustomerManager {
    private ArrayList<Customer> list = new ArrayList<>();

    public void addCustomer(Customer c) {
        list.add(c);
    }

    public void displayAll() {
        System.out.printf("%-10s %-20s %-10s %-15s%n", "ID", "Name", "Age", "Salary");
        for (Customer c : list) {
            c.display();
        }
    }
}
