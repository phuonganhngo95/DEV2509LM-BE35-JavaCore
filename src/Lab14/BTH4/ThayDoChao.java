package Lab14.BTH4;

import static Lab14.BTH4.ChaoHoi.ThayDo;
import static Lab14.BTH4.ChaoHoi.XaTruong;

public class ThayDoChao extends Thread {
    public void run() {
        synchronized (ThayDo) {
            System.out.println("Thầy đồ: Cúi người chào");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            System.out.println("Thầy đồ: đợi xã trưởng chào lại");
            synchronized (XaTruong) {
                System.out.println("Thầy đồ: kết thúc chào hỏi");
            }
        }
    }
}
