package Lab09.BT3.asia;

import Lab09.BT3.country.Country;

import java.util.Scanner;

public class AsiaCountry extends Country {
    private String location;

    public AsiaCountry() {
        super();
    }

    public AsiaCountry(String countryName, double area, long numberPerson, String location) {
        super(countryName, area, numberPerson);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        sc.nextLine();
        System.out.print("Nhập location: ");
        this.setLocation(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Location: " + this.getLocation());
    }
}
