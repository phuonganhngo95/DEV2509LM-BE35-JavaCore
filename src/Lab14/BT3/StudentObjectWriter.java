package Lab14.BT3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.BlockingQueue;

public class StudentObjectWriter implements Runnable {
    private BlockingQueue<Student> queue;
    private int fileCounter = 0;

    public StudentObjectWriter(BlockingQueue<Student> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (StudentManagementSystem.isRunning || !queue.isEmpty()) {
            try {
                Student student = queue.poll(1, java.util.concurrent.TimeUnit.SECONDS);

                if (student != null) {
                    fileCounter++;
                    String fileName = String.format("Sinhvien_%02d.dat", fileCounter);
                    try (ObjectOutputStream oos = new ObjectOutputStream(
                            new FileOutputStream(fileName))) {
                        oos.writeObject(student);
                        System.out.println("Đã ghi sinh viên " + student.getStudName() +
                                " vào file " + fileName);
                    } catch (IOException e) {
                        System.err.println("Lỗi khi ghi file đối tượng " + fileName +
                                ": " + e.getMessage());
                    }
                }
            } catch (InterruptedException e) {
                if (!StudentManagementSystem.isRunning && queue.isEmpty()) {
                    break;
                }
            }
        }
    }
}
