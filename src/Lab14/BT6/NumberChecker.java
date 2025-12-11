package Lab14.BT6;

public class NumberChecker extends Thread {
    private NumberData sharedData;

    public NumberChecker(NumberData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            while (sharedData.shouldContinue()) {
                sharedData.checkNumber();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Checker đã dừng");
        }
    }
}
