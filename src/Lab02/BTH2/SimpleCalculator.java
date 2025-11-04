package Lab02.BTH2;

import java.util.Scanner;

public class SimpleCalculator {
    public void tinhTong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Tổng: " + (a+b));
    }

    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        s.tinhTong();
    }
}
