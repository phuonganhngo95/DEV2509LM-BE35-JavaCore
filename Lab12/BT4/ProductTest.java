package Lab12.BT4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Product " + (i+1));
            System.out.print("Nhập proId: ");
            String id = sc.nextLine();
            System.out.print("Nhập product name: ");
            String name = sc.nextLine();
            System.out.print("Nhập producer: ");
            String producer = sc.nextLine();
            System.out.print("Nhập year: ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập price: ");
            float price = Float.parseFloat(sc.nextLine());

            Product p = new Product(id, name, producer, year, price);
            products.add(p);
        }

        try {
            FileOutputStream fos = new FileOutputStream("product.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
            System.out.println("Ghi dữ liệu thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Product> productsFile = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("product.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            productsFile = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- DANH SÁCH SẢN PHẨM ---");
        for (Product p : productsFile) {
            System.out.println(p);
        }

        System.out.print("\nNhập tên sản phẩm cần tìm: ");
        String search = sc.nextLine();
        boolean found = false;
        for (Product p : productsFile) {
            if (p.getProName().toLowerCase().contains(search.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}
