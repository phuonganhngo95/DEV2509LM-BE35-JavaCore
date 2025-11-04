package Lab01.B4;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.print("Nhập m: ");
        float m = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhập xâu kí tự: ");
        String kt = sc.nextLine();
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("String: " + kt);
    }
}