public class LoanRequest {
    private Account account;
    private double loanAmount;

    public LoanRequest(Account account, double loanAmount) {
        this.account = account;
        this.loanAmount = loanAmount;
    }

    public Account getAccount() {
        return account;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
