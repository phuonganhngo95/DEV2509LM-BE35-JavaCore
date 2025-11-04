package Lab02.BTH1;

import java.util.Scanner;

public class SinhVien {
    private String name, address;
    private int soLanThi;
    private float diemJava;
    private double lePhiThi;
    private char gioiTinh;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập số lần thi: ");
        soLanThi = sc.nextInt();
        System.out.print("Nhập điểm Java: ");
        diemJava = sc.nextFloat();
        System.out.print("Nhập lệ phí thi: ");
        lePhiThi = sc.nextDouble();
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.next().charAt(0);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        System.out.println("Tên: " + sv.name);
        System.out.println("Số lần thi: " + sv.soLanThi);
        System.out.println("Điểm Java: " + sv.diemJava);
        System.out.println("Nhập lệ phí thi: " + sv.lePhiThi);
        System.out.println("Giới tính: " + sv.gioiTinh);
    }
}
