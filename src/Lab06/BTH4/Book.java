package Lab06.BTH4;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private int numOfPage;
    private float price;

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu cho sách:");
        System.out.print("Tên sách: ");
        this.bookName = sc.nextLine();
        System.out.print("Nhà xuất bản: ");
        this.nxb = sc.nextLine();
        System.out.print("Năm xuất bản: ");
        this.yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.print("Tác giả: ");
        this.author = sc.nextLine();
        System.out.print("Số trang: ");
        this.numOfPage = sc.nextInt();
        System.out.print("Giá: ");
        this.price = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Book{" + "bookName= " + bookName +
                ", nxb= " + nxb + ", yearOfPublish= " + yearOfPublish +
                ", author= " + author + ", numOfPage= " + numOfPage + ", price= " + price + "}";
    }
}
