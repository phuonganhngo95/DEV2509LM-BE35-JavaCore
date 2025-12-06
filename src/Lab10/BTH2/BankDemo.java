package Lab10.BTH2;

public class BankDemo {
    public static void main(String[] args) throws InsufficentFundsException {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500");
        c.deposit(500.00);

        System.out.println("\nWithdrawing $100");
        c.deposit(100.00);
        System.out.println("\nWithdrawing $600");
        c.deposit(600.00);
    }
}
