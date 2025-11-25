package Lab07.BTH1;

public class MainClass {
    final float PI = 3.14F;

    public void display(float pi) {
//        PI = pi;
        System.out.println("The value of PI is: " + PI);
    }

    public static void main(String[] args) {
        final MainClass obj = new MainClass();
        obj.display(22.7F);
    }
}
