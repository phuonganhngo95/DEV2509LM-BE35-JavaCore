package Lab14.BT6;

import java.util.Random;

public class EvenOddSynchronizationV2 {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        Thread t1 = new Thread(() -> {
            Random rand = new Random();
            try {
                for (int i = 0; i < 5; i++) {
                    processor.lock.lock();
                    try {
                        while (processor.numberReady) {
                            processor.condition.await();
                        }
                        processor.currentNumber = rand.nextInt(100) + 1;
                        processor.numberReady = true;

                        System.out.println("Thread 1: Số " + processor.currentNumber);
                        processor.condition.signal();
                    } finally {
                        processor.lock.unlock();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    processor.lock.lock();
                    try {
                        while (!processor.numberReady) {
                            processor.condition.await();
                        }
                        String type = (processor.currentNumber % 2 == 0) ? "CHẴN" : "LẺ";
                        System.out.println("Thread 2: " + processor.currentNumber + " là số " + type);
                        System.out.println();
                        processor.numberReady = false;
                        processor.condition.signal();
                    } finally {
                        processor.lock.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
