package Lab02.B4;

import java.util.Scanner;

public class PtBac2 {
    private float a, b, c;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextFloat();
        System.out.print("Nhập b: ");
        b = sc.nextFloat();
        System.out.print("Nhập c: ");
        c = sc.nextFloat();
    }

    public void giaiPT() {
        double delta = Math.pow(b, 2) - 4*a*c;
        if (a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm duy nhất: " + (-c/b));
            }
        } else {
            if(delta > 0) {
                double x1 = (-b+Math.sqrt(delta)) / (2*a);
                double x2 = (-b-Math.sqrt(delta)) / (2*a);
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

    public static void main(String[] args) {
        PtBac2 pt = new PtBac2();
        pt.nhap();
        pt.giaiPT();
    }
}
