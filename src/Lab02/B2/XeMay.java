package Lab02.B2;

import java.util.Scanner;

public class XeMay {
    private String ten, nhaSanXuat;
    private int soLuongBanhXe;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("Nhập số lượng bánh xe: ");
        soLuongBanhXe = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Sô luoengj bánh xe: " + soLuongBanhXe);
    }

    public static void main(String[] args) {
        XeMay xm = new XeMay();
        xm.nhapThongTin();
        xm.hienThiThongTin();
    }
}
