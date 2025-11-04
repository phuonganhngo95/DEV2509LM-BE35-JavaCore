package Lab01.B5;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.print("Nhập m: ");
        int m = sc.nextInt();
        System.out.println("Tổng: " + (n+m));
    }
}
