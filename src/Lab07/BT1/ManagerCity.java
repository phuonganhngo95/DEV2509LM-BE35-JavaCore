package Lab07.BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManagerCity {
    private static List<City> cityList = new ArrayList<>();

    private static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            City city = new City();
            city.nhap();
            cityList.add(city);
        }
    }

    private static void hienThiThongTin() {
        for (City city : cityList) {
            city.hienThi();
        }
    }

    private static void sapXepTheoTenNuoc() {
        Collections.sort(cityList, new Comparator<City>() {
            @Override
            public int compare(City c1, City c2) {
                return c1.getCountry().compareTo(c2.getCountry());
            }
        });
        hienThiThongTin();
    }

    private static void timKiemTheoCityId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cityId cần tìm: ");
        String searchId = sc.nextLine();

        City found = null;
        for (City city : cityList) {
            if (city.getCityId().equalsIgnoreCase(searchId)) {
                found = city;
                break;
            }
        }

        if (found != null) {
            found.hienThi();
        } else {
            System.out.println("Không tìm thấy thành phố nào");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=====MENU QUẢN LÝ THÀNH PHỐ=====");
            System.out.println("1. Nhập thông tin n thành phố");
            System.out.println("2. Hiển thị thông tin vừa nhập");
            System.out.println("3. Sắp xếp thông tin tăng dần theo tên nước");
            System.out.println("4. Tìm kiếm thông tin theo cityId");
            System.out.println("5. Thoát.");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    nhapThongTin();
                    break;
                case 2:
                    hienThiThongTin();
                    break;
                case 3:
                    sapXepTheoTenNuoc();
                    break;
                case 4:
                    timKiemTheoCityId();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 5);
    }
}
