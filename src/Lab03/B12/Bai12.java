package Lab03.B12;

import java.util.Scanner;

public class Bai12 {
    public static int fibonacci(int n) {
        if(n < 0) {
            return -1;
        } else if (n==0 || n==1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
