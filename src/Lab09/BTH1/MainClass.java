package Lab09.BTH1;

public class MainClass {
    public void phepTinh(ITinhToan pheptinh, float num1, float num2) {
        pheptinh.doOperation(num1, num2);
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();

        ImplOperationAdd add = new ImplOperationAdd();
        add.setAccuracy(IAccuracy.TWO_NUMBER);
        main.phepTinh(add, 6, 9);

        ImplOperationMultiply multi = new ImplOperationMultiply();
        multi.setAccuracy(IAccuracy.FOUR_NUMBER);
        main.phepTinh(multi, 3, 3);

        ImplOperationSubtract sub = new ImplOperationSubtract();
        sub.setAccuracy(IAccuracy.THREE_NUMBER);
        main.phepTinh(sub, 9, 6);
    }
}
