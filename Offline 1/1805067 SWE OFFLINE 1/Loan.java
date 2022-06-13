public class Loan extends Account {
    public Loan(String name, double amount) {
        super(name, 0, amount, 0);
    }

    @Override
    public void deposit(double amount) {
        System.out.print(amount+"$ deposited.");
        if(amount > super.getLoan()) {
            super.deposit(super.getLoan());
            System.out.print(amount - super.getLoan()+"$ returned");
        } else {
            super.deposit(amount);
        }
        System.out.print(" Remaining Loan "+ super.getBalance()+"$\n");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Invalid transaction; you cannot withdraw from a loan account");
    }

    @Override
    public boolean applyForLoan(double amount) {
        if(amount > 0.05 * super.getLoan()) {
            System.out.println("The maximum additional loan allowable for loan account is 5% of current loan");
            return false;
        }
        return true;
    }
}
