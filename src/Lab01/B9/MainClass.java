package Lab01.B9;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập b: ");
        float b = sc.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phuownh trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm duy nhất: " + (-b/a));
        }
    }
}
