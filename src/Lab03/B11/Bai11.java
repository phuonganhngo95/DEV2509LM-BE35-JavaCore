package Lab03.B11;

import java.util.Scanner;

public class Bai11 {
    public static boolean hoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Các số hoàn hảo: ");
        for (int i = 0; i < n; i++) {
            if (hoanHao(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
