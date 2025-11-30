package Lab09.BT3.country;

import java.util.Scanner;

public class Country implements ICountry {
    private String countryName;
    private double area;
    private long numberPerson;

    public Country() {}

    public Country(String countryName, double area, long numberPerson) {
        this.countryName = countryName;
        this.area = area;
        this.numberPerson = numberPerson;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(long numberPerson) {
        this.numberPerson = numberPerson;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập countryName: ");
        this.setCountryName(sc.nextLine());
        System.out.print("Nhập area: ");
        this.setArea(sc.nextDouble());
        System.out.print("Nhập numberPerson: ");
        this.setNumberPerson(sc.nextLong());
    }

    @Override
    public void display() {
        System.out.println("CountryName: " + this.getCountryName());
        System.out.println("Area: " + this.getArea());
        System.out.println("NumberPerson: " + this.getNumberPerson());
    }

    @Override
    public float averageArea(double area, long numberPerson) {
        return (float) (area / numberPerson);
    }
}
