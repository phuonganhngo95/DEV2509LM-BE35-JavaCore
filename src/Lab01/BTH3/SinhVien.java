package Lab01.BTH3;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String tenSinhVien = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhập điểm lý thuyết: ");
        float diemThiLyThuyet = sc.nextFloat();
        System.out.print("Nhập điểm thực hành: ");
        float diemthiThucHanh = sc.nextFloat();
        System.out.println("Chào bạn " + tenSinhVien + " - " + tuoi + " tuổi");
        System.out.println("Điểm trung bình: " + ((diemThiLyThuyet+diemthiThucHanh)/2));
    }
}
