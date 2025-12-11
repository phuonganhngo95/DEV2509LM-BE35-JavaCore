package Lab14.BT3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class StudentFileWriter implements Runnable {
    private BlockingQueue<Student> queue;
    private BufferedWriter writer;

    public StudentFileWriter(BlockingQueue<Student> queue) {
        this.queue = queue;
        try {
            writer = new BufferedWriter(new FileWriter("Sinhvien.txt", true));
            System.out.println("Đã mở file Sinhvien.txt để ghi");
        } catch (IOException e) {
            System.err.println("Lỗi khi mở file Sinhvien.txt: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            while (StudentManagementSystem.isRunning || !queue.isEmpty()) {
                try {
                    Student student = queue.poll(1, java.util.concurrent.TimeUnit.SECONDS);
                    if (student != null) {
                        writer.write(student.toFileString());
                        writer.newLine();
                        writer.flush();
                    }
                } catch (InterruptedException e) {
                    if (!StudentManagementSystem.isRunning && queue.isEmpty()) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file text: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Lỗi khi đóng file text: " + e.getMessage());
            }
        }
    }
}
