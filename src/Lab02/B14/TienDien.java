package Lab02.B14;

import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số cũ: ");
        int chiSoCu = scanner.nextInt();
        System.out.print("Nhập chỉ số mới: ");
        int chiSoMoi = scanner.nextInt();
        if (chiSoMoi < chiSoCu) {
            System.out.println("Nhập lại");
            return;
        }
        int soDienTieuThu = chiSoMoi - chiSoCu;
        final int THUE_BAO = 1000;
        final int DINH_MUC = 50;
        final int GIA_DINH_MUC = 230;
        int tienDinhMuc = 0;
        int tienVuotDinhMuc = 0;
        int tongTien = THUE_BAO;
        if (soDienTieuThu <= DINH_MUC) {
            tienDinhMuc = soDienTieuThu * GIA_DINH_MUC;
            tienVuotDinhMuc = 0;
        } else {
            tienDinhMuc = DINH_MUC * GIA_DINH_MUC;
            int vuotDinhMuc = soDienTieuThu - DINH_MUC;
            if (vuotDinhMuc <= 50) {
                tienVuotDinhMuc = vuotDinhMuc * 480;
            } else if (vuotDinhMuc <= 100) {
                tienVuotDinhMuc = 50 * 480 + (vuotDinhMuc - 50) * 700;
            } else {
                tienVuotDinhMuc = 50 * 480 + 50 * 700 + (vuotDinhMuc - 100) * 900;
            }
        }

        tongTien += tienDinhMuc + tienVuotDinhMuc;
        System.out.println("Chỉ số cũ: " + chiSoCu + " KW");
        System.out.println("Chỉ số mới: " + chiSoMoi + " KW");
        System.out.println("Số điện tiêu thụ: " + soDienTieuThu + " KW");
        System.out.println("Tiền thuê bao: " + THUE_BAO + "đ");
        System.out.println("Tiền trả định mức: " + tienDinhMuc + "đ");
        System.out.println("Tiền trả vượt định mức: " + tienVuotDinhMuc + "đ");
        System.out.println("Tổng tiền phải trả: " + tongTien + "đ");
    }
}
