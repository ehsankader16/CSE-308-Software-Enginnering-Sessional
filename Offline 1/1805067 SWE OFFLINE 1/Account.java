public class Account {
    private final String name;
    private int activeYear;
    private double balance;
    private double loan;
    private double depositInterestRate;
    private double loanInterestRate;
    Account(String name, double amount, double loan, double depositInterestRate) {
        this.name = name;
        this.activeYear = 0;
        this.balance = amount;
        this.loan = loan;
        this.depositInterestRate = depositInterestRate;
        this.loanInterestRate = 10;
        Bank.setFund(amount-loan);
    }

    public String getAccountName() {
        return name;
    }

    public int getActiveYear() {
        return activeYear;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoan() {
        return loan;
    }

    public double getDepositInterestRate() {
        return depositInterestRate;
    }

    public boolean setDepositInterestRate(double depositInterestRate) {
        this.depositInterestRate = depositInterestRate;
        return true;
    }

    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    public void deposit(double amount) {
        double extra = amount - loan;
        if(loan > 0) {
            if (loan > amount) {
                this.loan = loan - amount;
                extra = 0;
            } else {
                this.loan = 0;
            }
            System.out.println(Math.abs(loan-amount)+" is deducted for repayment of loan.");
        }
        this.balance += extra;
        Bank.setFund(amount);
    }

    public void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("Invalid transaction; current balance "+this.balance);
            return;
        }
        this.balance -= amount;
        Bank.setFund(-amount);
    }

    public boolean applyForLoan(double amount) {
        return false;
    }
    public boolean addLoan(double amount) {
        this.loan += amount;
        return true;
    }

    public void increaseActiveYear() {
        this.activeYear++;
        balance = balance+(balance*depositInterestRate/100);
        loan = loan+(loan*loanInterestRate/100);
        if(balance < 500) {
            loan += (500 - balance);
            balance = 0;
        } else {
            balance -= 500;
        }
    }

    public void query(boolean showLoan) {
        System.out.print("Current Balance "+this.balance+"$");
        if(showLoan)
            System.out.print(", Loan "+ this.loan +"$\n");
        else
            System.out.println("\n");
    }
}
