package Lab02.B5;

import java.util.Scanner;

public class ChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Chẵn");
        } else {
            System.out.println("Lẻ");
        }
    }
}
