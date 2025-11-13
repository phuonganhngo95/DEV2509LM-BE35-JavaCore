package Lab04.BT;

public class HoaDonBanhMy {
    private String maHoaDon;
    private String ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiGiaoHang;
    private int soLuongBanh;
    private double giaBan1Chiec;

    private double tongTienHang;
    private double tienKhuyenMai;
    private double tongTienPhaiThanhToan;

    public HoaDonBanhMy(String maHoaDon, String ngayLapHoaDon, String tenKhachHang,
                        String diaChiGiaoHang, int soLuongBanh, double giaBan1Chiec) {
        this.maHoaDon = maHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.soLuongBanh = soLuongBanh;
        this.giaBan1Chiec = giaBan1Chiec;

        tinhTienKhuyenMai();
    }

    public void tinhTienKhuyenMai() {
        double giaSauGiam = giaBan1Chiec;
        double tongTienBanDau = soLuongBanh * giaBan1Chiec;

        this.tienKhuyenMai = 0;

        if (soLuongBanh >= 10 && soLuongBanh < 100) {
            giaSauGiam = giaBan1Chiec * 0.9;
            this.tienKhuyenMai = tongTienBanDau - (soLuongBanh * giaSauGiam);
            this.tongTienHang = soLuongBanh * giaSauGiam;
        } else if (soLuongBanh >= 100) {
            this.tongTienHang = tongTienBanDau;
            this.tienKhuyenMai = tongTienBanDau * 0.20;
        } else {
            this.tongTienHang = tongTienBanDau;
            this.tienKhuyenMai = 0;
        }
        this.tongTienPhaiThanhToan = this.tongTienHang - this.tienKhuyenMai;
        this.tongTienHang = soLuongBanh * giaBan1Chiec;
        this.tienKhuyenMai = 0;

        if (soLuongBanh >= 10 && soLuongBanh < 100) {
            this.tienKhuyenMai = this.tongTienHang * 0.10;
        } else if (soLuongBanh >= 100) {
            this.tienKhuyenMai = this.tongTienHang * 0.20;
        }

        this.tongTienPhaiThanhToan = this.tongTienHang - this.tienKhuyenMai;
    }

    public void inHoaDon() {
        System.out.println("--- HÓA ĐƠN BÁNH MỲ ---");
        System.out.printf("Mã HĐ: %s | Ngày Lập: %s\n", maHoaDon, ngayLapHoaDon);
        System.out.printf("Khách hàng: %s | Địa chỉ: %s\n", tenKhachHang, diaChiGiaoHang);
        System.out.println("-------------------------");
        System.out.printf("Số lượng bánh: %d\n", soLuongBanh);
        System.out.printf("Giá bán 1 chiếc: %.0f VNĐ\n", giaBan1Chiec);
        System.out.println("-------------------------");
        System.out.printf("Tổng tiền hàng (Base): %.0f VNĐ\n", tongTienHang);
        System.out.printf("Tiền khuyến mãi:      %.0f VNĐ\n", tienKhuyenMai);
        System.out.printf("**Tổng tiền phải thanh toán**: **%.0f VNĐ**\n", tongTienPhaiThanhToan);
    }

    public int getSoLuongBanh() {
        return soLuongBanh;
    }
}