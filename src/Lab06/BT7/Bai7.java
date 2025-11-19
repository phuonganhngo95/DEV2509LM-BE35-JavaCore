package Lab06.BT7;

import java.util.Scanner;

public class Bai7 {
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

        System.out.print("\nCác số chẵn trong mảng: ");
        boolean found = false;
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không có số chẵn nào");
        }
    }
}
