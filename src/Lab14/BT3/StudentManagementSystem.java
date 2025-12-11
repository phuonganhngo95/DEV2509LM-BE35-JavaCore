package Lab14.BT3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StudentManagementSystem {
    public static volatile boolean isRunning = true;
    
    public static void main(String[] args) {
        BlockingQueue<Student> studentQueue = new ArrayBlockingQueue<>(10);

        Thread inputThread = new Thread(new StudentInput(studentQueue));
        Thread fileWriterThread = new Thread(new StudentFileWriter(studentQueue));
        Thread objectWriterThread = new Thread(new StudentObjectWriter(studentQueue));
        

        System.out.println("Nhập thông tin sinh viên:");
        inputThread.start();
        fileWriterThread.start();
        objectWriterThread.start();

        try {
            inputThread.join();
            isRunning = false;
            Thread.sleep(1000);
            fileWriterThread.interrupt();
            objectWriterThread.interrupt();
            
            fileWriterThread.join(1000);
            objectWriterThread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

