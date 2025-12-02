package Lab08.BT1;

import java.util.Scanner;

public abstract class GiangVien {
    protected String ten;
    protected String email;
    protected String diaChi;
    protected String dienThoai;
    protected int soGioGiangDay;

    public GiangVien() {}

    public GiangVien(String ten, String email, String diaChi, String dienThoai, int soGioGiangDay) {
        this.ten = ten;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên giảng viên: ");
        sc.nextLine();
        ten = sc.nextLine();
        System.out.print("Nhập email: ");
        email = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập điện thoại: ");
        dienThoai = sc.nextLine();
        System.out.print("Nhập số giờ giảng dạy trong tháng: ");
        soGioGiangDay = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Email: " + email);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Điện thoại: " + dienThoai);
        System.out.println("Số giờ giảng dạy: " + soGioGiangDay);
    }

    public abstract double tinhLuong();
}
