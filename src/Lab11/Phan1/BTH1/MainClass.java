package Lab11.Phan1.BTH1;

public class MainClass {
    public static void main(String[] args) {
        MyGeneries<String> stringMyGeneries = new MyGeneries<String>();
        MyGeneries<Integer> integerMyGeneries = new MyGeneries<Integer>();

        stringMyGeneries.setT("Tôi yêu Việt Nam");
        integerMyGeneries.setT(2015);

        System.out.println("Giá trị tại stringGeneries= " + stringMyGeneries.getT());
        System.out.println("Giá trị tại integerGeneries= " + integerMyGeneries.getT());
    }
}
