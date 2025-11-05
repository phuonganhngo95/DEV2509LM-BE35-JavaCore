package Lab03.B7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        int tongle = 0;

        System.out.print("Số lẻ < n: ");
        for (int i = 1; i <= n; i++) {
            if (i%2!=0 && i<n) {
                tongle += Math.pow(i, 2);
                System.out.print(i + " ");
            }
        }

        System.out.println("\nTổng các số lẻ đó: " + tongle);

        System.out.print("\nCác số chắn > tbc n: ");
        int tongchan = 0;
        for (int i = 1; i <= n; i++) {
            tongchan += i;
            if(i%2==0) {
                if(i > ((float)tongchan/n)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
