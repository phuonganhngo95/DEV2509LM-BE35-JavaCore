package Lab01.B10;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập c: ");
        float c = sc.nextFloat();
        double delta = Math.pow(b, 2) - 4*a*c;

        if (a == 0) {
            if (b == 0) {
                if(c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm duy nhât: " + (-b/a));
            }
        } else {
            if (delta > 0) {
                double x1 = (-b+Math.sqrt(delta) / (2*a));
                double x2 = (-b-Math.sqrt(delta) / (2*a));
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if(delta == 0) {
                System.out.println("Phương trình có nghiệm kép: x = " + (-b/(2*a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
