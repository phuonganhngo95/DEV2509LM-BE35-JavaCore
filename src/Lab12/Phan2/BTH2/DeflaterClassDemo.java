package Lab12.Phan2.BTH2;

public class DeflaterClassDemo {
    String input = "Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam"
            + "Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam"
            + "Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam"
            + "Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam"
            + "Cộng Hòa Xã Hội Chủ Nghĩa Việt Nam";

    public static void main(String[] args) throws Exception {
        DeflaterClassDemo demo = new DeflaterClassDemo();
        byte[] dataCompress = CompressionUtils.compress(demo.input.getBytes());
        CompressionUtils.decompress(dataCompress);
    }
}
