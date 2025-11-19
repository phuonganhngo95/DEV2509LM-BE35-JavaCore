package Lab06.BTH3;

import java.util.ArrayList;
import java.util.Collections;

public class BaiThucHanh03 {
    ArrayList<String> lstMonHoc = new ArrayList<>();

    public void test() {
        lstMonHoc.add("Java");
        lstMonHoc.add("SQL");
        lstMonHoc.add("PHP");
        lstMonHoc.add("C#");
        lstMonHoc.add("Android");

        System.out.println("Danh sách chưa sắp xếp");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            String get = lstMonHoc.get(i);
            System.out.println((i+1) + " " + get);
        }

        Collections.sort(lstMonHoc);
        System.out.println("Danh sách sau khi sắp xếp");
        for (int i = 0; i < lstMonHoc.size(); i++) {
            String get = lstMonHoc.get(i);
            System.out.println((i+1) + " " + get);
        }
    }

    public static void main(String[] args) {
        BaiThucHanh03 demo = new BaiThucHanh03();
        demo.test();
    }
}
