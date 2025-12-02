package Lab08.BT1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiangVien {
    private static ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();
            xuLyLuaChon(luaChon);
        } while (luaChon != 0);
    }

    private static void hienThiMenu() {
        System.out.println("\n=== QUẢN LÝ GIẢNG VIÊN ===");
        System.out.println("1. Nhập thông tin giảng viên");
        System.out.println("2. Xuất danh sách toàn bộ giảng viên");
        System.out.println("3. Xuất danh sách giảng viên cơ hữu");
        System.out.println("4. Xuất danh sách giảng viên thỉnh giảng");
        System.out.println("5. Tính tổng số tiền lương của toàn bộ giảng viên");
        System.out.println("6. Tìm giảng viên có tổng lương cao nhất");
        System.out.println("0. Thoát");
    }

    private static void xuLyLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                nhapThongTinGiangVien();
                break;
            case 2:
                xuatDanhSachGiangVien();
                break;
            case 3:
                xuatDanhSachGiangVienCoHuu();
                break;
            case 4:
                xuatDanhSachGiangVienThinhGiang();
                break;
            case 5:
                tinhTongLuong();
                break;
            case 6:
                timGiangVienLuongCaoNhat();
                break;
            case 0:
                System.out.println("Thoát chương trình!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    private static void nhapThongTinGiangVien() {
        System.out.println("\n--- NHẬP THÔNG TIN GIẢNG VIÊN ---");
        System.out.println("1. Giảng viên cơ hữu");
        System.out.println("2. Giảng viên thỉnh giảng");
        System.out.print("Chọn loại giảng viên: ");
        int loai = scanner.nextInt();

        GiangVien gv;
        if (loai == 1) {
            gv = new GiangVienCoHuu();
        } else if (loai == 2) {
            gv = new GiangVienThinhGiang();
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }
        gv.nhapThongTin();
        danhSachGiangVien.add(gv);
    }

    private static void xuatDanhSachGiangVien() {
        for (int i = 0; i < danhSachGiangVien.size(); i++) {
            System.out.println("\nGiảng viên thứ " + (i + 1) + ":");
            danhSachGiangVien.get(i).hienThiThongTin();
        }
    }

    private static void xuatDanhSachGiangVienCoHuu() {
        System.out.println("\n--- DANH SÁCH GIẢNG VIÊN CƠ HỮU ---");
        boolean coGiangVienCoHuu = false;

        for (GiangVien gv : danhSachGiangVien) {
            if (gv instanceof GiangVienCoHuu) {
                gv.hienThiThongTin();
                coGiangVienCoHuu = true;
            }
        }

        if (!coGiangVienCoHuu) {
            System.out.println("Không có giảng viên cơ hữu nào!");
        }
    }

    private static void xuatDanhSachGiangVienThinhGiang() {
        System.out.println("\n--- DANH SÁCH GIẢNG VIÊN THỈNH GIẢNG ---");
        boolean coGiangVienThinhGiang = false;

        for (GiangVien gv : danhSachGiangVien) {
            if (gv instanceof GiangVienThinhGiang) {
                gv.hienThiThongTin();
                coGiangVienThinhGiang = true;
            }
        }

        if (!coGiangVienThinhGiang) {
            System.out.println("Không có giảng viên thỉnh giảng nào!");
        }
    }

    private static void tinhTongLuong() {
        System.out.println("\n--- TỔNG LƯƠNG TOÀN BỘ GIẢNG VIÊN ---");
        double tongLuong = 0;

        for (GiangVien gv : danhSachGiangVien) {
            tongLuong += gv.tinhLuong();
        }

        System.out.println("Tổng lương: " + tongLuong + " VNĐ");
    }

    private static void timGiangVienLuongCaoNhat() {
        System.out.println("\n--- GIẢNG VIÊN CÓ LƯƠNG CAO NHẤT ---");
        GiangVien gvLuongCaoNhat = danhSachGiangVien.get(0);
        double maxLuong = gvLuongCaoNhat.tinhLuong();

        for (GiangVien gv : danhSachGiangVien) {
            if (gv.tinhLuong() > maxLuong) {
                maxLuong = gv.tinhLuong();
                gvLuongCaoNhat = gv;
            }
        }

        System.out.println("Giảng viên có lương cao nhất:");
        gvLuongCaoNhat.hienThiThongTin();
        System.out.println("Lương: " + maxLuong + " VNĐ");
    }
}
