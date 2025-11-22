package Lab11.BT4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner; // Sử dụng Scanner thay vì BufferedReader

public class BookManager {
    private List<Book> danhSachBook;

    public BookManager() {
        this.danhSachBook = new ArrayList<>();
    }

    public void nhapDanhSachBook(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho cuốn sách thứ " + (i + 1) + ":");
            System.out.print("  Nhập ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("  Nhập Tên sách: ");
            String bookName = sc.nextLine();
            System.out.print("  Nhập Tác giả: ");
            String author = sc.nextLine();
            System.out.print("  Nhập NXB: ");
            String publisher = sc.nextLine();
            System.out.print("  Nhập Giá (float): ");
            float price = sc.nextFloat();
            sc.nextLine();

            Book book = new Book(isbn, bookName, author, publisher, price);
            danhSachBook.add(book);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("\nDanh sách sách vừa nhập");
        for (Book book : danhSachBook) {
            System.out.println(book);
        }
    }

    public void hienThiDanhSachSapXep() {
        Collections.sort(danhSachBook, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Float.compare(b2.getPrice(), b1.getPrice());
            }
        });

        System.out.println("\nDanh sách đã sắp xếp:");
        for (Book book : danhSachBook) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        sc.nextLine();

        manager.nhapDanhSachBook(n);
        manager.hienThiDanhSach();
        manager.hienThiDanhSachSapXep();
    }
}