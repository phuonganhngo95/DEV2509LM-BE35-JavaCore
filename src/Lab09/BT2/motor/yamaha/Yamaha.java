package Lab09.BT2.motor.yamaha;

import Lab09.BT1.vehicle.car.Car;
import Lab09.BT1.vehicle.truck.Truck;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Yamaha {
    private static final Jupiter[] jupiters = new Jupiter[3];
    private static final Serius[] seriuses = new Serius[3];

    public static void input() {
        for (int i = 0; i < jupiters.length; i++) {
            System.out.println("Nhập jupiter thứ " + (i+1));
            jupiters[i] = new Jupiter();
            jupiters[i].inputInfo();
            System.out.println();
        }

        for (int i = 0; i < seriuses.length; i++) {
            System.out.println("Nhập serius thứ " + (i+1));
            seriuses[i] = new Serius();
            seriuses[i].inputInfo();
            System.out.println();
        }
    }

    public static void display() {
        System.out.println("Jupiters:");
        for (int i = 0; i < jupiters.length; i++) {
            jupiters[i].displayInfo();
            System.out.println();
        }

        System.out.println("Seriuses:");
        for (int i = 0; i < seriuses.length; i++) {
            seriuses[i].displayInfo();
            System.out.println();
        }
    }

    public static void sort() {
        Arrays.sort(jupiters, new Comparator<Jupiter>() {
            @Override
            public int compare(Jupiter j1, Jupiter j2) {
                return Double.compare(j1.getWarranty(), j2.getWarranty());
            }
        });

        Arrays.sort(seriuses, new Comparator<Serius>() {
            @Override
            public int compare(Serius s1, Serius s2) {
                return Double.compare(s1.getWarranty(), s2.getWarranty());
            }
        });

        System.out.println("Sau khi sắp xếp:");
        display();
    }

    public static void search() {
        boolean found = false;
        System.out.println("Những xe có tên Serius:");
        for (int i = 0; i < jupiters.length; i++) {
            if (jupiters[i].getName().equalsIgnoreCase("Serius")) {
                jupiters[i].displayInfo();
                found = true;
            }
        }

        for (int i = 0; i < seriuses.length; i++) {
            if (seriuses[i].getName().equalsIgnoreCase("Serius")) {
                seriuses[i].displayInfo();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy xe có tên Serius");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Thoat");
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
