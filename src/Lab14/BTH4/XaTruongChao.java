package Lab14.BTH4;

import static Lab14.BTH4.ChaoHoi.ThayDo;
import static Lab14.BTH4.ChaoHoi.XaTruong;

public class XaTruongChao extends Thread {
    public static void main(String[] args) {
        ThayDoChao thayDo = new ThayDoChao();
        XaTruongChao xaTruong = new XaTruongChao();
        thayDo.start();
        xaTruong.start();
    }

    public void run() {
        synchronized (XaTruong) {
            System.out.println("Xã trưởng: Cúi người chào");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            System.out.println("Xã trưởng: đợi thầy đồ chào lại");
            synchronized (ThayDo) {
                System.out.println("Xã trưởng: kết thúc chào hỏi");
            }
        }
    }
}
