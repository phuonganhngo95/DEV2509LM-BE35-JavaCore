package Lab02.B6;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập c: ");
        float c = sc.nextFloat();

        if(a>0 && b>0 && c>0) {
            if(a+b>c && b+c>a && c+a>b) {
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("Chu vi: " + (a+b+c));
                System.out.println("Diên tích: " + s);
            } else {
                System.out.println("3 cạnh không phù hợp");
            }
        } else {
            System.out.println("3 cạnh không phù hợp");
        }
    }
}
