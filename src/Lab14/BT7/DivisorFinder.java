package Lab14.BT7;

public class DivisorFinder extends Thread {
    private NumberData sharedData;

    public DivisorFinder(NumberData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            while (sharedData.shouldContinue()) {
                sharedData.findDivisors();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread DivisorFinder đã dừng");
        }
    }
}
