package Lab03.BTH4;

public class BaiThucHanh04 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                cnt++;
            }
        }
        if(cnt == 10) {
            return;
        }
        System.out.println(cnt);
    }
}
