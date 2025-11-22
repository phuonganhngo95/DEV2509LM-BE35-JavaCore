package Lab11.BT5;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductTest {
    private Map<Integer, Product> danhSachProduct;

    public ProductTest() {
        this.danhSachProduct = new HashMap<>();
    }

    public void nhapDanhSachProduct(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            System.out.println("\nNhập thông tin cho sản phẩm thứ " + i + ":");
            System.out.print("Nhập Product ID: ");
            String proId = sc.nextLine();
            System.out.print("Nhập Tên sản phẩm: ");
            String proName = sc.nextLine();
            System.out.print("Nhập Nhà sản xuất: ");
            String producer = sc.nextLine();
            System.out.print("Nhập Năm sản xuất: ");
            int yearMaking = sc.nextInt();
            System.out.print("Nhập Giá: ");
            float price = sc.nextFloat();
            sc.nextLine();

            Product product = new Product(proId, proName, producer, yearMaking, price);
            danhSachProduct.put(i, product);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("\nDanh sách sản phẩm:");
        for (Map.Entry<Integer, Product> entry : danhSachProduct.entrySet()) {
            System.out.println("Key " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public void hienThiDanhSachSapXep() {
        List<Map.Entry<Integer, Product>> listProduct = new ArrayList<>(danhSachProduct.entrySet());
        Collections.sort(listProduct, new Comparator<Map.Entry<Integer, Product>>() {
            @Override
            public int compare(Map.Entry<Integer, Product> entry1, Map.Entry<Integer, Product> entry2) {
                int year1 = entry1.getValue().getYearMaking();
                int year2 = entry2.getValue().getYearMaking();
                return year1 - year2;
            }
        });
        System.out.println("\nDanh sách sản phẩm đã sắp xếp:");
        for (Map.Entry<Integer, Product> entry : listProduct) {
            System.out.println("Key " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ProductTest manager = new ProductTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();
        manager.nhapDanhSachProduct(n);
        manager.hienThiDanhSach();
        manager.hienThiDanhSachSapXep();
    }
}
