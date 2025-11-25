package DEVMASTER;

import luatdoanhnghiep.khoinhanuoc.tienluong.TienLuong;

public class NhanVien {
    public static void main(String[] args) {
        int tham_nien = 8;
        double luong = TienLuong.luongCoBan(TienLuong.BAC_CAO_DANG, tham_nien);
        System.out.println("Lương của nhân viên: " + luong);
        System.out.println("Phí bảo hiểm: " + TienLuong.soTienBaoHiem(luong));
    }
}
