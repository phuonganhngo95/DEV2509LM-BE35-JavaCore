package Lab02.B3;

import java.util.Scanner;

public class SinhVien {
    private String ten;
    private int msv;
    private float diemLT, diemTH;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập mã: ");
        msv = sc.nextInt();
        System.out.print("Nhập điểm lý thuyết: ");
        diemLT = sc.nextFloat();
        System.out.print("Nhập điểm thực hành: ");
        diemTH = sc.nextFloat();
    }

    public void hienThi() {
        double tb = (diemLT+diemTH) / 2;
        if (diemLT < 4) {
            System.out.println("Thi lại lý thuyết");
        }
        if(diemTH < 4) {
            System.out.println("Thi lại thực hành");
        }
        if (tb < 4) {
            System.out.println("Sinh viên phải học lại");
        }
        if (tb>=4 && tb<=7) {
            System.out.println("Sinh viên đạt môn Java");
        }
        if (tb > 7){
            System.out.println("Sinh viên xuất sắc môn Java");
        }
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.hienThi();
    }
}
