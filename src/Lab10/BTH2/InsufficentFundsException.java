package Lab10.BTH2;

public class InsufficentFundsException extends Exception {
    private double amount;

    @Override
    public void printStackTrace() {
        System.out.println("Tài khoản của quý khách không đủ thực hiện giao dịch này");
        super.printStackTrace();
    }

    public InsufficentFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
