package Lab02.BTH1;

import java.util.Scanner;

public class DuBaoThoiTiet {
    int lc;

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình dự báo thười tiết Chuồn chuồn");
        System.out.println("1. Bay thấp");
        System.out.println("2. Bay cao");
        System.out.println("3. Bay vừa");
        System.out.println("4. Say rượu cmn rồi!");
        System.out.println("Mời nhập từ 1 --> 4");

        System.out.print("Nhập lựa chọn: ");
        lc = sc.nextInt();
        System.out.println("Cảm ơn đã nhập");
    }

    public void hienThiDuBao() {
        switch (lc) {
            case 1:
                System.out.println("Dự báo: Mưa, khi ra khỏi nhà nhớ mang áo mưa");
                break;
            case 2:
                System.out.println("Dự báo: Nắng, nhớ mang ô nhé!");
                break;
            case 3:
                System.out.println("Dự báo: Râm, mát giời");
                break;
            case 4:
                System.out.println("Dự báo: Xin lỗi, do nhậu say nên ko trả lời");
                break;
            default:
                System.out.println("Chuồn chuồn thử 'beep' 404 lần nhưng ko có kết quả");
                break;
        }
    }

    public static void main(String[] args) {
        DuBaoThoiTiet db = new DuBaoThoiTiet();
        db.nhapDuLieu();
        db.hienThiDuBao();
    }
}
