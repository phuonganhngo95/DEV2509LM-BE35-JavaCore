package Lab04.BT;

import java.util.Scanner;

public class QuanLyHoaDon {
    public static HoaDonBanhMy nhapHoaDon() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã hóa đơn: ");
        String ma = scanner.nextLine();
        System.out.print("Ngày lập hóa đơn: ");
        String ngay = scanner.nextLine();
        System.out.print("Tên Khách hàng: ");
        String ten = scanner.nextLine();
        System.out.print("Địa chỉ giao hàng: ");
        String diaChi = scanner.nextLine();
        System.out.print("Số lượng bánh cần giao: ");
        int soLuong = scanner.nextInt();
        System.out.print("Giá bán 1 chiếc bánh: ");
        double gia = scanner.nextDouble();
        return new HoaDonBanhMy(ma, ngay, ten, diaChi, soLuong, gia);
    }

    public static void inHoaDon(HoaDonBanhMy obj) {
        if (obj != null) {
            obj.inHoaDon();
        } else {
            System.out.println("Lỗi: Không có hóa đơn để in.");
        }
    }

    public static void main(String[] args) {
        HoaDonBanhMy hd_test1 = new HoaDonBanhMy("HD001", "12/11/2025", "Nguyễn Văn A", "123 P. Láng Hạ", 5, 10000);
        inHoaDon(hd_test1);

        HoaDonBanhMy hd_test2 = new HoaDonBanhMy("HD002", "12/11/2025", "Trần Thị B", "456 P. Cầu Giấy", 50, 10000);
        inHoaDon(hd_test2);

        HoaDonBanhMy hd_test3 = new HoaDonBanhMy("HD003", "12/11/2025", "Lê Văn C", "789 P. Giải Phóng", 150, 10000);
        inHoaDon(hd_test3);
    }
}
