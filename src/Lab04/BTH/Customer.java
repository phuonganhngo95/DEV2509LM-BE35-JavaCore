package Lab04.BTH;

import java.util.Scanner;

public class Customer {
    private String id;
    private String name;
    private int age;
    private double salary;

    public Customer() {
    }

    public Customer(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        boolean valid;

        do {
            System.out.print("Nhập ID (6 ký tự): ");
            id = sc.nextLine();
            valid = id.length() == 6;
            if (!valid) {
                System.out.println("ID phải đúng 6 ký tự!");
            }
        } while (!valid);

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        do {
            System.out.print("Nhập tuổi (18 < tuổi < 60): ");
            age = sc.nextInt();
            valid = (age > 18 && age < 60);
            if (!valid) {
                System.out.println("Tuổi phải lớn hơn 18 và nhỏ hơn 60!");
            }
        } while (!valid);

        do {
            System.out.print("Nhập lương: ");
            salary = sc.nextDouble();
            valid = (salary > 1_000_000);
            if (!valid) {
                System.out.println("Lương phải lớn hơn 1,000,000!");
            }
        } while (!valid);
        sc.nextLine();
    }

    public void display() {
        System.out.printf("%-10s %-20s %-10d %-15.2f%n", id, name, age, salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
