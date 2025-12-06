package Lab10.BTH4;

import java.util.Scanner;

public class BaiThucHanh04 {
    public static void main(String[] args) {
        try {
            String number = null;
            Scanner sc = new Scanner(System.in);
            String temp = null;
            if ((temp=sc.nextLine()).isEmpty()) {
                number = null;
            } else {
                number = temp;
            }
            System.out.println("temp= [" + temp + "]");
            float soThuc = Float.parseFloat(number);
            System.out.println("Số thực: " + soThuc);
            System.out.println("Phép chia= " + (10/(int)soThuc));
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Dữ liệu không hợp lệ");
        } catch (ArithmeticException e) {
            System.out.println("Lỗi tính toán");
        } catch (Exception e) {
            System.out.println("Không thể thực hiện thao tác");
        } finally {
            System.out.println("Chương trình kết thúc");
        }
    }
}
