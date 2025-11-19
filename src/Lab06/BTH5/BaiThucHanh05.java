package Lab06.BTH5;

import Lab06.BTH4.BaiThucHanh04;

public class BaiThucHanh05 {
    void yeuCau1() {
        String vietnam = "Việt Nam";
        System.out.println("concat()= " + vietnam.concat(" Cộng hòa XHCN"));
    }

    void yeuCau2() {
        String baoViet = "Tổng Cty Bảo Hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " +
                "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " +
                "Bảo Việt đầu tư 100 vốn";
        System.out.println("length()= " + baoViet.length());
        baoViet = baoViet.replaceAll("Cty", "Công Ty");
        System.out.println("replaceAll()= " + baoViet);
    }

    void yeuCau3() {
        String baoViet = "Tổng Cty Bảo Hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " +
                "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " +
                "Bảo Việt đầu tư 100 vốn";
        System.out.println("toUpperCase()= " + baoViet.toUpperCase());
        System.out.println("toLowerCase()= " + baoViet.toLowerCase());
    }

    void yeuCau4() {
        String baoViet = "Tổng Cty Bảo Hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " +
                "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " +
                "Bảo Việt đầu tư 100 vốn";
        System.out.println("lastIndexOf()= " + baoViet.lastIndexOf("Bảo Việt"));
    }

    void yeuCau5() {
        String baoViet = "Tổng Cty Bảo Hiểm Bảo Việt (Bảo hiểm Bảo Việt - Baoviet " +
                "Insurance) là Cty thành viên được Tập đoàn Tài chính - Bảo hiểm " +
                "Bảo Việt đầu tư 100 vốn";
        String[] arr = baoViet.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String arr1 = arr[i];
            if (i % 2 == 0) {
                System.out.println("\t" + arr1);
            } else {
                System.out.println(arr1);
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh05 bth5 = new BaiThucHanh05();
        bth5.yeuCau1();
        bth5.yeuCau2();
        bth5.yeuCau3();
        bth5.yeuCau4();
        bth5.yeuCau5();
    }
}
