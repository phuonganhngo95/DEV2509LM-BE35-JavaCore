package Lab01.B6;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n1: ");
        int n1 = sc.nextInt();
        System.out.print("Nhập m1: ");
        int m1 = sc.nextInt();
        System.out.print("Nhập n2: ");
        float n2 = sc.nextFloat();
        System.out.print("Nhập m2: ");
        float m2 = sc.nextFloat();
        System.out.println("Tồng 2 số nguyên: " + (n1+m1));
        System.out.println("Tổng 2 số thực: " + (n2+m2));
        System.out.println("Tổng n1 + n2 = " + ((float)n1+n2));
    }
}
