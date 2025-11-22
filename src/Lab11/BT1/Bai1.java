package Lab11.BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> lstSoNguyen = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int soNguyen = sc.nextInt();
            lstSoNguyen.add(soNguyen);
        }

        System.out.println("Danh sách vừa nhập:");
        System.out.println(lstSoNguyen);

        Collections.sort(lstSoNguyen);
        System.out.println("Danh sách đã sắp xếp:");
        System.out.println(lstSoNguyen);
    }
}