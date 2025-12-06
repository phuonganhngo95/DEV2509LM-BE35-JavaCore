package Lab10.BTH3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiThucHanh03 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int soA = sc.nextInt();
            int soB = sc.nextInt();

            try {
                System.out.println("Phép chia = " + (soA/soB));
            } catch (ArithmeticException e) {
                System.out.println("Lỗi tính toán: " + e.toString());
            }
        } catch (InputMismatchException e) {
            System.out.println("Dữ liệu nhập không hợp lệ " + e.toString());
        } finally {
            System.out.println("Dữ liệu nhập an toàn");
        }
    }
}
