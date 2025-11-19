package Lab06.BT3;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Chọn cách nhập:");
        System.out.println("1. Nhập tay");
        System.out.println("2. Tự động");
        System.out.print("Nhập lựa chọn: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Nhập các phần tử:");
            for (int i = 0; i < n; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        } else {
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(100);
            }
        }

        System.out.print("Mảng vừa nhập: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
