package Lab02.B11;

import java.util.Scanner;

public class MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập toán tử: ");
        char kt = sc.next().charAt(0);

        switch (kt) {
            case '+':
                System.out.println("Tổng: " + (a+b));
                break;
            case '-':
                System.out.println("Hiệu: " + (a-b));
                break;
            case '*':
                System.out.println("Tích: " + (a*b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Không chia được");
                } else {
                    System.out.println("Thương: " + (a/b));
                }
                break;
        }
    }
}
