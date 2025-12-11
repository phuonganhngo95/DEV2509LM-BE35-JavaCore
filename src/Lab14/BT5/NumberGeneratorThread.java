package Lab14.BT5;

public class NumberGeneratorThread extends Thread {
    private SharedNumberData sharedData;

    public NumberGeneratorThread(SharedNumberData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            while (sharedData.shouldContinue()) {
                sharedData.generateAndClassifyNumber();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Generator đã dừng");
        }
    }
}
