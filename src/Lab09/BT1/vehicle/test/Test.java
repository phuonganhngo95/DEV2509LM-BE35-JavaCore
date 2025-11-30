package Lab09.BT1.vehicle.test;

import Lab09.BT1.vehicle.car.Car;
import Lab09.BT1.vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    private static final Car[] cars = new Car[3];
    private static final Truck[] trucks = new Truck[3];

    public static void input() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Nhập car thứ " + (i+1));
            cars[i] = new Car();
            cars[i].input();
            System.out.println();
        }

        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Nhập truck thứ " + (i+1));
            trucks[i] = new Truck();
            trucks[i].input();
            System.out.println();
        }
    }

    public static void display() {
        System.out.println("Car:");
        for (int i = 0; i < cars.length; i++) {
            cars[i].display();
            System.out.println();
        }

        System.out.println("Truck:");
        for (int i = 0; i < trucks.length; i++) {
            trucks[i].display();
            System.out.println();
        }
    }

    public static void sort() {
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        Arrays.sort(trucks, new Comparator<Truck>() {
            @Override
            public int compare(Truck t1, Truck t2) {
                return Double.compare(t1.getPrice(), t2.getPrice());
            }
        });

        System.out.println("Sau khi sắp xếp:");
        display();
    }

    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập model cần tìm: ");
        String s = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equalsIgnoreCase(s)) {
                cars[i].display();
                found = true;
            }
        }

        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i].getModel().equalsIgnoreCase(s)) {
                trucks[i].display();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy " + s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort by price");
            System.out.println("4. Search by model");
            System.out.println("5.Exit");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    search();
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (choice != 5);
    }
}
