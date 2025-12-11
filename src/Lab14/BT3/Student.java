package Lab14.BT3;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int counter = 0;
    private String studName;
    private int studAge;
    private String address;
    private int id;

    public Student(String studName, int studAge, String address) {
        this.studName = studName;
        this.studAge = studAge;
        this.address = address;
        this.id = ++counter;
    }

    public String getStudName() {
        return studName;
    }

    public int getStudAge() {
        return studAge;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sinh viên [" + id + "]: " +
                studName.toUpperCase() + " " +
                studAge + " " +
                address;
    }

    public String toFileString() {
        return studName.toUpperCase() + " " + studAge + " " + address;
    }
}
