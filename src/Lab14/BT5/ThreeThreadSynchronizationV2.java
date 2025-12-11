package Lab14.BT5;

import java.util.Random;

class ThreeThreadSynchronizationV2 {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        Thread generator = new Thread(() -> {
            Random rand = new Random();
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (processor) {
                        while (!processor.isProcessed) {
                            processor.wait();
                        }
                        processor.number = rand.nextInt(51);
                        processor.isEven = (processor.number % 2 == 0);
                        processor.numberReady = true;
                        processor.isProcessed = false;

                        System.out.println("\nGenerator: Số " + processor.number +
                                " (" + (processor.isEven ? "chẵn" : "lẻ") + ")");
                        processor.notifyAll();
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread evenHandler = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (processor) {
                        while (!processor.numberReady || !processor.isEven) {
                            processor.wait();
                        }
                        System.out.println("EvenHandler: Xử lý số " + processor.number);
                        System.out.print("Ước số: ");
                        if (processor.number == 0) {
                            System.out.println("vô số");
                        } else {
                            for (int j = 1; j <= processor.number; j++) {
                                if (processor.number % j == 0) {
                                    System.out.print(j + " ");
                                }
                            }
                            System.out.println();
                        }

                        processor.numberReady = false;
                        processor.isProcessed = true;
                        processor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread oddHandler = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (processor) {
                        while (!processor.numberReady || processor.isEven) {
                            processor.wait();
                        }
                        System.out.println("OddHandler: Xử lý số " + processor.number);
                        int square = processor.number * processor.number;
                        System.out.println("Bình phương: " + square);

                        processor.numberReady = false;
                        processor.isProcessed = true;
                        processor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        generator.start();
        evenHandler.start();
        oddHandler.start();

        try {
            generator.join();
            evenHandler.join();
            oddHandler.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
