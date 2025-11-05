package Lab03.B4;

import java.util.Scanner;

public class Bai4 {
    public static boolean is_Prime(int n) {
        if (n < 2) return false;
        for (int i  = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        if (is_Prime(n)) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không phải số nguyên tố");
        }
    }
}
