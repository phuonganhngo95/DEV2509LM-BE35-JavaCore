package Lab03.B6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập dài: ");
        int d = sc.nextInt();
        System.out.print("Nhập rộng: ");
        int r = sc.nextInt();

        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= r; j++) {
                if(i==1 || i==d || j==1 || j==r) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
