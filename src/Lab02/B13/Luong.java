package Lab02.B13;

import java.util.Scanner;

public class Luong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        int sogio = sc.nextInt();
        System.out.print("Nhập lương giờ: ");
        double luonggio = sc.nextLong();

        if(sogio > 40) {
            luonggio = sogio * 1.5;
        }

        System.out.println("Lương tổng: " + luonggio);
    }
}
