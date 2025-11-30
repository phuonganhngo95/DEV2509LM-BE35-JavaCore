package Lab09.BT3.asia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    private static AsiaCountry[] countries;

    private static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();
        countries = new AsiaCountry[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập country thứ " + (i + 1));
            countries[i] = new AsiaCountry();
            countries[i].input();
        }
    }

    private static void display() {
        for (int i = 0; i < countries.length; i++) {
                countries[i].display();
        }
    }

    private static void sort() {
        Arrays.sort(countries, new Comparator<AsiaCountry>() {
            @Override
            public int compare(AsiaCountry c1, AsiaCountry c2) {
                return Double.compare(c2.getArea(), c1.getArea()); // Giảm dần
            }
        });

        System.out.println("Sau khi sắp xếp:");
        display();
    }

    private static void find() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tìm countryName: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < countries.length; i++) {
            if (countries[i] != null && countries[i].getCountryName().equalsIgnoreCase(searchName)) {
                countries[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy : " + searchName);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Input information for n countries of Asia");
            System.out.println("2. Display information");
            System.out.println("3. Sort descending by area and display result");
            System.out.println("4. Find information by countryName");
            System.out.println("5. Exit");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

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
                    find();
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (choice != 4);
    }
}
