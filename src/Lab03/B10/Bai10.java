package Lab03.B10;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Là số hoàn hảo");
        } else {
            System.out.println("Không là số hoàn hảo");
        }
    }
}
