package Lab11.BT2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai2 {
    public static void main(String[] args) {
        Set<String> tenThanhPho = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- NHẬP DANH SÁCH TÊN THÀNH PHỐ ---");
        System.out.print("Nhập số lượng thành phố (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên thành phố thứ " + (i + 1) + ": ");
            String ten = sc.nextLine();
            tenThanhPho.add(ten);
        }

        System.out.println("Danh sách thành phố:");
        System.out.println(tenThanhPho);

        System.out.println("Danh sách đã sắp xếp:");
        System.out.println(tenThanhPho);
    }
}
