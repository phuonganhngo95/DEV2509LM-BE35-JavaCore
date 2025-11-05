package Lab03.B9;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("Cuối tuần bạn muốn làm gì?");
            System.out.println("1. Đi học Java");
            System.out.println("2. Đi chơi Công viên ngắm gấu");
            System.out.println("3. Đi (về) nhà nghỉ");
            System.out.println("4. Ra sông Hồng tắm tiên");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");
            lc = sc.nextInt();

            switch (lc) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: System.exit(0);
            }
        } while (lc != 0);
    }
}
