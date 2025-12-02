package Lab08.BT1;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private double luongThoaThuan;
    private static final int gio_quy_dinh = 40;
    private static final double luong_gio_vuot = 50000;

    public GiangVienCoHuu() {}

    public GiangVienCoHuu(String ten, String email, String diaChi, String dienThoai,
                          int soGioGiangDay, double luongThoaThuan) {
        super(ten, email, diaChi, dienThoai, soGioGiangDay);
        this.luongThoaThuan = luongThoaThuan;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập lương thỏa thuận: ");
        luongThoaThuan = sc.nextDouble();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lương thỏa thuận: " + luongThoaThuan);
        System.out.println("Lương tháng: " + tinhLuong());
        System.out.println("Loại: Giảng viên cơ hữu");
    }

    @Override
    public double tinhLuong() {
        if (soGioGiangDay > gio_quy_dinh) {
            int gioVuot = soGioGiangDay - gio_quy_dinh;
            return luongThoaThuan + (gioVuot * luong_gio_vuot);
        }
        return luongThoaThuan;
    }
}
