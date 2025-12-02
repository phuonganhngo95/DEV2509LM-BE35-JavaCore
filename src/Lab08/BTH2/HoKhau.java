package Lab08.BTH2;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
    private String diaChiHienNay;
    private String noiCongTac;

    public HoKhau() {}

    public HoKhau(String hoVaTen, String ngaySinh, boolean gioiTinh, String diaChiHienNay, String noiCongTac) {
        super(hoVaTen, ngaySinh, gioiTinh);
        this.diaChiHienNay = diaChiHienNay;
        this.noiCongTac = noiCongTac;
    }

    public String getDiaChiHienNay() {
        return diaChiHienNay;
    }

    public void setDiaChiHienNay(String diaChiHienNay) {
        this.diaChiHienNay = diaChiHienNay;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhập địa chỉ thường trú: ");
        this.diaChiHienNay = sc.nextLine();
        System.out.print("Nhập nơi công tác: ");
        this.noiCongTac = sc.nextLine();
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println("Hộ khẩu: " + diaChiHienNay);
        System.out.println("Nơi công tác: " + noiCongTac);
    }
}
