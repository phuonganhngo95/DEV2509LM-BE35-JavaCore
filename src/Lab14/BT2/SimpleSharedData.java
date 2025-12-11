package Lab14.BT2;

public class SimpleSharedData {
    private int number;
    private boolean generated = false;

    public synchronized void generateNumber(int num) {
        while (generated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.number = num;
        this.generated = true;
        notify();
    }

    public synchronized void checkNumber() {
        while (!generated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (number % 2 == 0) {
            System.out.println("Thread 2: Số " + number + " là số CHẴN");
        } else {
            System.out.println("Thread 2: Số " + number + " là số LẺ");
        }
        this.generated = false;
        notify();
    }
}
