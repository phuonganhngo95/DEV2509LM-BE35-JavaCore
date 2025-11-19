package Lab06.BT5;

import java.util.Scanner;

public class Bai5 {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
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

        System.out.print("\nCác số nguyên tố trong mảng: ");
        boolean found = false;
        for (int num : arr) {
            if (laSoNguyenTo(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không có số nguyên tố nào");
        }
    }
}
