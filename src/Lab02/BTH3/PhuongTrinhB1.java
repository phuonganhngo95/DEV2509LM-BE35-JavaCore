package Lab02.BTH3;

import java.util.Scanner;

public class PhuongTrinhB1 {
    int soA, soB, soC;

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        soA = sc.nextInt();
        System.out.print("Nhập b: ");
        soB = sc.nextInt();
        System.out.print("Nhập c: ");
        soC = sc.nextInt();
    }

    public void giaiPhuongTrinhB1() {
        if (soA == 0) {
            if (soB == 0) {
                if (soC == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm duy nhất: " + (-(soC-soB)/soA));
        }
    }

    public static void main(String[] args) {
        PhuongTrinhB1 phuongTrinhB1 = new PhuongTrinhB1();
        phuongTrinhB1.nhapDuLieu();
        phuongTrinhB1.giaiPhuongTrinhB1();
    }
}
