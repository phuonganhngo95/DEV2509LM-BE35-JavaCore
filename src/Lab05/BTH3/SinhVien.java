package Lab05.BTH3;

import java.util.Scanner;

public class SinhVien {
    private int rollNo;
    private String name;
    private String address;
    private float mark;

    public SinhVien() {}

    /**
     * @param rollNo Mã sinh viên
     * @param name Tên sinh viên
     */
    public SinhVien(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    /**
     * @param rollNo Mã sinh viên
     * @param name Tên sinh viên
     * @param address Địa chỉ của sinh viên
     */
    public SinhVien(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    /**
     * @param rollNo Mã sinh viên
     * @param name Tên sinh viên
     * @param address Địa chỉ của sinh viên
     * @param mark Điểm của sinh viên
     */
    public SinhVien(int rollNo, String name, String address, float mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public void Nhap() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhập số: ");
        this.setRollNo(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên: ");
        this.setName(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(sc.nextLine());
        System.out.print("Nhập điểm số: ");
        this.setMark(sc.nextFloat());
    }

    public void HienThi() {
        System.out.println("Mã: " + this.getRollNo());
        System.out.println("Tên: " + this.getName());
        System.out.println("Địa chỉ: " + this.getAddress());
        System.out.println("Điểm số: " + this.getMark());
    }
}
