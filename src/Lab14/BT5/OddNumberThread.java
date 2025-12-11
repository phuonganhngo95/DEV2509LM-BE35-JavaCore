package Lab14.BT5;

public class OddNumberThread extends Thread {
    private SharedNumberData sharedData;

    public OddNumberThread(SharedNumberData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            while (sharedData.shouldContinue()) {
                sharedData.processOddNumber();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread OddHandler đã dừng");
        }
    }
}
