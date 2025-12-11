package Lab14.BT3;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class StudentInput implements Runnable {
    private BlockingQueue<Student> queue;
    private Scanner scanner;

    public StudentInput(BlockingQueue<Student> queue) {
        this.queue = queue;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        while (StudentManagementSystem.isRunning) {
            try {
                System.out.print("Nhập tên sinh viên: ");
                String name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Kết thúc nhập dữ liệu.");
                    StudentManagementSystem.isRunning = false;
                    break;
                }
                int age = 0;
                while (true) {
                    try {
                        System.out.print("Nhập tuổi: ");
                        age = Integer.parseInt(scanner.nextLine());
                        if (age > 0 && age < 150) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số hợp lệ!");
                    }
                }
                System.out.print("Nhập địa chỉ: ");
                String address = scanner.nextLine().trim();
                Student student = new Student(name, age, address);

                System.out.println("\n--- THÔNG TIN SINH VIÊN ---");
                System.out.println(student.toString());
                queue.put(student);

                System.out.print("\nNhập tiếp? (y/n): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (choice.equals("n") || choice.equals("no")) {
                    StudentManagementSystem.isRunning = false;
                    break;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
