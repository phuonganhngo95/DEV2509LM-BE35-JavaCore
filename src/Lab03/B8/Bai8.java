package Lab03.B8;

import java.util.Scanner;

public class Bai8 {
    public static long giaiThua(int n) {
        long giaithua = 1;
        if (n==0 || n==1) {
            return giaithua;
        } else {
            for (int i = 2; i <= n;i++) {
                giaithua *= i;
            }
            return giaithua;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        System.out.println("Giai thừa: " + giaiThua(n));
    }
}
