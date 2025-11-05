package Lab03.BTH5;

import java.util.Scanner;

public class BaiThucHanh05 {
    public void docSo(double soThapPhan) {
        if (soThapPhan < 20) {
            phatAmSo((int) soThapPhan);
        } else if (soThapPhan>=20 && soThapPhan<100) {
            phatAmSo((int) soThapPhan / 10);
            System.out.print(" mươi");
        }
    }

    public void number4Text(double number) {
        double phanDu = number;
        do {
            phanDu = number % 10;
            double thapPhan = number - phanDu;
//            System.out.println("Phần dư: " + phanDu);
//            System.out.println("Thập phân: " + thapPhan);
        } while (phanDu > 10);

        if (phanDu > 0) {
            System.out.print(" ");
            phatAmSo((int) phanDu);
            System.out.println("\n");
        }
    }

    public void phatAmSo(int so) {
        switch (so) {
            case 0:
                System.out.print("không");
                break;
            case 1:
                System.out.print("một");
                break;
            case 2:
                System.out.print("hai");
                break;
            case 3:
                System.out.print("ba");
                break;
            case 4:
                System.out.print("tư");
                break;
            case 5:
                System.out.print("năm");
                break;
            case 6:
                System.out.print("sáu");
                break;
            case 7:
                System.out.print("bảy");
                break;
            case 8:
                System.out.print("tám");
                break;
            case 9:
                System.out.print("chín");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();
        BaiThucHanh05 b = new BaiThucHanh05();
        b.docSo(n);
        b.phatAmSo(n);
        b.number4Text(n);
    }
}
