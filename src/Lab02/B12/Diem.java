package Lab02.B12;

import java.util.Scanner;

public class Diem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Toán:");
        float toan = sc.nextFloat();
        System.out.print("Nhập điểm Lý: ");
        float ly = sc.nextFloat();
        System.out.print("Nhập điểm Hóa:");
        float hoa = sc.nextFloat();
        double tong = toan + ly + hoa;

        if (tong>=15 && toan>4 && ly>4 && hoa>4) {
            System.out.println("Đậu");
            if (tong>=15 && toan>5 && ly>5 && hoa>5) {
                System.out.println("Học đều các môn");
            } else {
                System.out.println("Học chưa đều các môn");
            }
        } else {
            System.out.println("Thi hỏng");
        }
    }
}
