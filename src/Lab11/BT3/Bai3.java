package Lab11.BT3;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Map<Integer, String> danhSachQuocGia = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập tên quốc gia thứ " + i + ": ");
            String ten = sc.nextLine();
            danhSachQuocGia.put(i, ten);
        }

        System.out.println("Danh sách đã nhập:");
        for (Map.Entry<Integer, String> entry : danhSachQuocGia.entrySet()) {
            System.out.println("Key " + entry.getKey() + ": " + entry.getValue());
        }

        List<Map.Entry<Integer, String>> listQuocGia = new ArrayList<>(danhSachQuocGia.entrySet());
        Collections.sort(listQuocGia, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        System.out.println("Danh sách đã sắp xếp:");
        for (Map.Entry<Integer, String> entry : listQuocGia) {
            System.out.println("Key " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
