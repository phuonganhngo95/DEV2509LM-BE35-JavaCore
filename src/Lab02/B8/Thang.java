package Lab02.B8;

import java.util.Scanner;

public class Thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int thang = sc.nextInt();

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tháng có 30 ngày");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                System.out.println("Nhập năm: ");
                int nam = sc.nextInt();
                if(nam%4 == 0) {
                    System.out.println("Tháng có 29 ngày");
                } else {
                    System.out.println("Tháng có 28 ngày");
                }
        }
    }
}
