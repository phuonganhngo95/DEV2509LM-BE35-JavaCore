package Lab09.BTH2;

import java.util.Scanner;

public class MainClass {
    private class NhapLieu {
        public String inputString() {
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }

        public int inputInt() {
            Scanner sc = new Scanner(System.in);
            do {
                try {
                    int number = Integer.parseInt(sc.nextLine());
                    return number;
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số nguyên");
                }
            } while (true);
        }

        public float inputFloat() {
            Scanner sc = new Scanner(System.in);
            do {
                try {
                    float number = Float.parseFloat(sc.nextLine());
                    return number;
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số thực");
                }
            } while (true);
        }
    }

    public void nhapDuLieu() {
        NhapLieu nhap = new NhapLieu();

        System.out.println("Nhập số nguyên");
        System.out.println("Value = " + nhap.inputInt());

        System.out.println("Nhập số thực");
        System.out.println("Value = " + nhap.inputFloat());

        System.out.println("Nhập số chuỗi");
        System.out.println("Value = " + nhap.inputString());
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.nhapDuLieu();
    }
}
