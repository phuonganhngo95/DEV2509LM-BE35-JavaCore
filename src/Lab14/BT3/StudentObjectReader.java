package Lab14.BT3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentObjectReader {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String fileName = String.format("Sinhvien_%02d.dat", i);
            File file = new File(fileName);

            if (file.exists()) {
                try (ObjectInputStream ois = new ObjectInputStream(
                        new FileInputStream(fileName))) {
                    Student student = (Student) ois.readObject();
                    System.out.println("Đọc từ " + fileName + ": " + student);
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Không thể đọc file " + fileName);
                }
            }
        }
    }
}
