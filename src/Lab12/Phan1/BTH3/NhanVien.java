package Lab12.Phan1.BTH3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVien implements Serializable {
    String name;
    int age;
    String address;

    public NhanVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")" + address;
    }
}
