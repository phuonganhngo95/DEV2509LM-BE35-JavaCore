package Lab07.BT1;

import java.util.Scanner;

public class City {
    private String cityId;
    private String cityName;
    private String country;
    private double area;

    public City() {}

    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }

    public double getArea() {
        return area;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cityId: ");
        this.cityId = sc.nextLine();
        System.out.print("Nhập cityName: ");
        this.cityName = sc.nextLine();
        System.out.print("Nhập country: ");
        this.country = sc.nextLine();
        System.out.print("Nhập area: ");
        this.area = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThi() {
        System.out.println("ID: " + cityId);
        System.out.println("Tên: " + cityName);
        System.out.println("Nước: " + country);
        System.out.println("Diện tích: " + area);
    }
}
