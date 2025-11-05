package Lab03.BTH6;

import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("=====MENU============");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Sinh viên xuất sắc nhất");
            System.out.println("5. Thoát");
            System.out.print("Mòi nhập từ 1 --> 5: ");
            lc = sc.nextInt();

            switch (lc) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: return;
            }
        } while (lc != 0);
    }
}
