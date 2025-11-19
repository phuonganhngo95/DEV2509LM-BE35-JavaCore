package Lab06.BT6;

import java.util.Scanner;

public class Bai6 {
    public static boolean laSoHoanHao(int n) {
        if (n < 2) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Mảng vừa nhập: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nCác số hoàn hảo trong mảng: ");
        boolean found = false;
        for (int num : arr) {
            if (laSoHoanHao(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không có số hoàn hảo nào");
        }
    }
}
