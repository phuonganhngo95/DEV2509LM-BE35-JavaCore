package Lab14.BT7;

public class NumberGenerator extends Thread {
    private NumberData sharedData;

    public NumberGenerator(NumberData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        System.out.println("Thread Generator đã bắt đầu");

        try {
            while (sharedData.shouldContinue()) {
                sharedData.generateNumber();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Generator đã dừng");
        }
    }
}
