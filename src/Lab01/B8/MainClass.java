package Lab01.B8;

import java.util.Scanner;

public class MainClass {
    public static float Max(float a, float b) {
        return (a > b) ? a : b;
    }

    public static float Min(float a, float b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập c: ");
        float c = sc.nextFloat();
        System.out.println("Max: " + Max(a, Max(b, c)));
        System.out.println("Min: " + Min(a, Min(b, c)));
    }
}
