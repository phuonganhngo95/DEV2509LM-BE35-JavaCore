package Lab02.B7;

import java.util.Scanner;

public class Max {
    public static int max(int a, int b) {
        return (a>b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        System.out.print("Nhập d: ");
        int d = sc.nextInt();

        System.out.println("Max: " + max(max(a, b), max(c, d)));
    }
}
