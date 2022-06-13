public class Student extends Account{
    private static double depoInterestRate; // current Deposit Interest Rate
    public Student(String name, double amount) {
        super(name, amount, 0, depoInterestRate);
    }

    public static void setDepoInterestRate(double interestRate) {
        depoInterestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        System.out.print(amount+"$ deposited.");
        super.deposit(amount);
        System.out.print(" Current balance "+ super.getBalance()+"$\n");
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 10000) {
            System.out.println("Invalid transaction; current balance "+super.getBalance());
            return;
        }
        super.withdraw(amount);
    }

    @Override
    public boolean applyForLoan(double amount) {
        if(amount > 1000) {
            System.out.println("The maximum allowable loan for student accounts are 1000");
            return false;
        }
        return true;
    }
}
