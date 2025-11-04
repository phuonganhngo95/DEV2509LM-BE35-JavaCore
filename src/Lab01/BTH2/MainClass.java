package Lab01.BTH2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập tên của bạn: ");
        String tenCuaBan;
        tenCuaBan = sc.nextLine();
        System.out.println("Chào bạn " + tenCuaBan + ", chúc bạn một ngày tốt lành!");
    }
}
