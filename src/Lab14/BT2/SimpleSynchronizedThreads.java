package Lab14.BT2;

import java.util.Random;

public class SimpleSynchronizedThreads {
    public static void main(String[] args) {
        SimpleSharedData sharedData = new SimpleSharedData();
        Thread generator = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                    int number = random.nextInt(51);
                    sharedData.generateNumber(number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread checker = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                    sharedData.checkNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        generator.start();
        checker.start();
        
        try {
            generator.join();
            checker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

