package Lab08.BTH2;

import java.util.Scanner;

public class NhanKhau {
    private String hoVaTen;
    private String ngaySinh;
    private boolean gioiTinh;

    public NhanKhau() {}

    public NhanKhau(String hoVaTen, String ngaySinh, boolean gioiTinh) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.hoVaTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();
        if ("nam".equalsIgnoreCase(gender)) {
            this.gioiTinh = true;
        } else {
            this.gioiTinh = false;
        }
    }

    public void hienThiTT() {
        System.out.println("Họ và tên: " + hoVaTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }
}
