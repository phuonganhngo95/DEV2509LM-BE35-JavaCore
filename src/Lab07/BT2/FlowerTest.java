package Lab07.BT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FlowerTest {
    private static List<Flower> flowerList = new ArrayList<>();

    private static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Flower flower = new Flower();
            flower.input();
            flowerList.add(flower);
        }
    }

    private static void hienThiThongTin() {
        for (Flower flower : flowerList) {
            flower.display();
        }
    }

    private static void sapXepTheoTenHoa() {
        Collections.sort(flowerList, new Comparator<Flower>() {
            @Override
            public int compare(Flower c1, Flower c2) {
                return c1.getFlowerName().compareTo(c2.getFlowerName());
            }
        });
        hienThiThongTin();
    }

    private static void timKiemTheoFlowerId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập flowerId cần tìm: ");
        String searchId = sc.nextLine();

        Flower found = null;
        for (Flower flower : flowerList) {
            if (flower.getFlowerId().equalsIgnoreCase(searchId)) {
                found = flower;
                break;
            }
        }
        if (found != null) {
            found.display();
        } else {
            System.out.println("Không tìm thấy hoa nào");
        }
    }

    private static void hienThiHoaMauTrang() {
        System.out.println("\n==========DANH SÁCH HOA CÓ MÀU TRẮNG==========");
        boolean foundWhite = false;

        for (Flower flower : flowerList) {
            if (flower.getColor().trim().equalsIgnoreCase("trắng")) {
                flower.display();
                foundWhite = true;
            }
        }

        if (!foundWhite) {
            System.out.println("Không tìm thấy loài hoa nào có màu trắng.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n=====MENU QUẢN LÝ THÀNH PHỐ=====");
            System.out.println("a. Nhập thông tin n loài hoa");
            System.out.println("b. Hiển thị thông tin vừa nhập");
            System.out.println("c. Sắp xếp thông tin tăng dần theo tên hoa");
            System.out.println("d. Tìm kiếm thông tin theo flowerId");
            System.out.println("e. Hiển thị tất cả các loại hoa có màu trắng");
            System.out.println("f. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.next().charAt(0);

            switch (choice) {
                case 'a':
                    nhapThongTin();
                    break;
                case 'b':
                    hienThiThongTin();
                    break;
                case 'c':
                    sapXepTheoTenHoa();
                    break;
                case 'd':
                    timKiemTheoFlowerId();
                    break;
                case 'e':
                    hienThiHoaMauTrang();
                    break;
                case 'f':
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }
}
