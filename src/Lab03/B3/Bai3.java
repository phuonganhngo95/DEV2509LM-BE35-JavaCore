package Lab03.B3;

import java.util.Scanner;

public class Bai3 {
    public static int ucln(int a, int b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }

    public static int bcnn(int a, int b) {
        return (a*b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("UCLN: " + ucln(a, b));
        System.out.println("BCNN: " + bcnn(a, b));
    }
}
