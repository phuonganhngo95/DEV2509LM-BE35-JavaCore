package Lab14.BT7;

import java.util.Random;

public class DivisorsSynchronizationV2 {
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

                        System.out.println("\nThread 1: Số " + processor.currentNumber);
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
                        System.out.println("Thread 2: Ước số của " + processor.currentNumber);
                        printDivisors(processor.currentNumber);
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

    private static void printDivisors(int number) {
        System.out.print("   ");
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i);
                count++;
                if (i < number) {
                    System.out.print(", ");
                }
                if (count % 8 == 0 && i < number) {
                    System.out.print("\n   ");
                }
            }
        }
        System.out.println("\n   Tổng: " + count + " ước số\n");
    }
}
