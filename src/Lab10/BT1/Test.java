package Lab10.BT1;

import java.util.*;

public class Test {
    private static List<LuxuryCar> carList = new ArrayList<>();

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of luxury cars: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Car " + (i+1));
            sc.nextLine();
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.print("Enter the producer: ");
            String producer = sc.nextLine();
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            System.out.print("Enter number of seats: ");
            int seat = sc.nextInt();
            System.out.print("Enter the root price: ");
            float rootPrice = sc.nextFloat();
            System.out.print("Enter the specialize rate: ");
            float specializeRate = sc.nextFloat();
            System.out.println();

            LuxuryCar luxuryCar = new LuxuryCar(name, producer, year, seat, rootPrice, specializeRate);
            carList.add(luxuryCar);
        }
    }

    public static void display() {
        System.out.println("\n===== LUXURY CAR LIST =====");
        for (LuxuryCar lists : carList) {
            lists.getInfo();
            System.out.println();
        }
    }

    public static void sort() {
        System.out.println("\n===== SORTED LIST =====");
        Collections.sort(carList, new Comparator<LuxuryCar>() {
            @Override
            public int compare(LuxuryCar o1, LuxuryCar o2) {
                return Float.compare(o2.getRootPrice(), o1.getRootPrice());
            }
        });

        display();
    }

    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car name to search: ");
        String newCar = sc.nextLine();
        boolean found = false;

        for (LuxuryCar lists : carList) {
            if (lists.getName().equalsIgnoreCase(newCar)) {
                lists.getInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No car found with name " + newCar);
        }
    }

    public static void displayTransCost() {
        System.out.println("\n===== TOTAL PRICE WITH TRANSPORT COST  $20.000=====");

        for (int i = 0; i < carList.size(); i++) {
            LuxuryCar car = carList.get(i);
            float totalPrice = car.calculatePrice(20000.0f);
            System.out.printf("Total price with transport: %.2f $\n", totalPrice);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lc;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input a list of LuxuryCar");
            System.out.println("2. Display the information of this list");
            System.out.println("3. Sort list descending by rootPrice and display");
            System.out.println("4. Search information by input car name");
            System.out.println("5. Display totalPrice of all cars which transportCost is $20.000");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            lc = sc.nextInt();

            switch (lc) {
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
                case 5:
                    displayTransCost();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (lc != 6);
    }
}
