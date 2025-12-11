package Lab14.BTH3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestJoin {
    public void start() {
        try {
            SumTotal sum1 = new SumTotal("Thread 1", 0, 3);
            SumTotal sum2 = new SumTotal("Thread 2", 4, 6);

            sum1.start();
            sum2.start();

            sum1.join();
            sum2.join();
            System.out.println(sum1.getName() + " is alive: " + sum1.isAlive());
            System.out.println(sum2.getName() + " is alive: " + sum2.isAlive());

            int total = sum1.total + sum2.total;
            System.out.println("Kết quả tổng = " + total);
        } catch (InterruptedException e) {
            Logger.getLogger(TestJoin.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void main(String[] args) {
        TestJoin test = new TestJoin();
        test.start();
    }
}
