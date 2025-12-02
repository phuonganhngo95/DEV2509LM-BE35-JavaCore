package Lab08.BT1;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String coQuanLamViec;
    private static final double don_gia = 200000;

    public GiangVienThinhGiang() {}

    public GiangVienThinhGiang(String ten, String email, String diaChi, String dienThoai, int soGioGiangDay, String coQuanLamViec) {
        super(ten, email, diaChi, dienThoai, soGioGiangDay);
        this.coQuanLamViec = coQuanLamViec;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập cơ quan làm việc: ");
        sc.nextLine();
        coQuanLamViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cơ quan làm việc: " + coQuanLamViec);
        System.out.println("Lương tháng: " + tinhLuong());
        System.out.println("Loại: Giảng viên thỉnh giảng");
    }

    @Override
    public double tinhLuong() {
        return soGioGiangDay * don_gia;
    }
}
