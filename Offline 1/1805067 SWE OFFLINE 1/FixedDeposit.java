public class FixedDeposit extends Account{
    private static double depoInterestRate; // current Deposit Interest Rate
    public FixedDeposit(String name, double amount) {
        super(name, amount, 0, depoInterestRate);
    }

    public static void setDepoInterestRate(double interestRate) {
        depoInterestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if(amount < 50000) {
            System.out.println("Deposit amount in fixed deposit account must not be less than 50000");
            return;
        }
        System.out.print(amount+"$ deposited.");
        super.deposit(amount);
        System.out.print(" Current balance "+ super.getBalance()+"$\n");
    }

    @Override
    public void withdraw(double amount) {
        if(this.getActiveYear() < 1) {
            System.out.println("Invalid transaction; current balance "+super.getBalance());
            return;
        }
        super.withdraw(amount);
    }

    @Override
    public boolean applyForLoan(double amount) {
        if(amount > 100000) {
            System.out.println("The maximum allowable loan for Fixed Deposit accounts are 100000");
            return false;
        }
        return true;
    }
}
