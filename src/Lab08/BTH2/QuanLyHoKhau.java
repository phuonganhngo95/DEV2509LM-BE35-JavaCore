package Lab08.BTH2;

import java.util.Scanner;

public class QuanLyHoKhau {
    private SoHoKhau[] arr;

    public int showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("|=============Menu=============|");
        System.out.println("1. Khai báo sổ hộ khẩu");
        System.out.println("2. Danh sách sổ hộ khẩu");
        System.out.println("3. Tìm người");
        System.out.print("Nhập từ 1-->3: ");
        return sc.nextInt();
    }

    public void khaiBaoSHK() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sổ hộ khẩu: ");
        arr = new SoHoKhau[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập số nhân khẩu hộ thứ " + (i+1));
            Scanner input = new Scanner(System.in);
            arr[i] = new SoHoKhau(input.nextInt());
            arr[i].nhapDuLieu();
        }
    }

    public void danhSachSHK() {
        if (arr == null) {
            System.out.println("Chưa khai báo sổ hộ khẩu.");
            return;
        }
        System.out.println("Danh sách sổ hộ khẩu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n=== Hộ khẩu thứ " + (i+1) + " ===");
            arr[i].hienThiDuLieu();
        }
    }

    public void timNguoi() {
        if (arr == null) {
            System.out.println("Chưa có dữ liệu hộ khẩu để tìm.");
            return;
        }

        System.out.println("Tìm người");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên người cần tìm: ");
        String tenCanTim = sc.nextLine();

        boolean timThay = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                boolean timThayTrongHo = arr[i].timNguoiTrongHoKhau(tenCanTim, i + 1); // Truyền số thứ tự hộ khẩu
                if (timThayTrongHo) {
                    timThay = true;
                }
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy người có tên: " + tenCanTim);
        }
    }

    public static void main(String[] args) {
        int lc = 0;
        QuanLyHoKhau quanLy = new QuanLyHoKhau();

        do {
            lc = quanLy.showMenu();

            switch (lc) {
                case 1:
                    quanLy.khaiBaoSHK();
                    break;
                case 2:
                    quanLy.danhSachSHK();
                    break;
                case 3:
                    quanLy.timNguoi();
                    break;
            }
        } while (lc>0 && lc<=3);
    }
}