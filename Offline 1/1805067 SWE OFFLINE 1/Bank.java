import java.util.ArrayList;

public class Bank {
    private final ArrayList employees;
    private static double fund;
    private int clock;
    private Employee loggedInEmployee;
    private Account loggedInAccount;
    private ArrayList accounts;
    private ArrayList loanRequests;

    Bank() {
        employees = new ArrayList<Employee>();
        employees.add(new ManagingDirector("MD"));
        employees.add(new Officer("S1"));
        employees.add(new Officer("S2"));
        employees.add(new Cashier("C1"));
        employees.add(new Cashier("C2"));
        employees.add(new Cashier("C3"));
        employees.add(new Cashier("C4"));
        employees.add(new Cashier("C5"));
        this.accounts = new ArrayList<Account>();
        this.loanRequests = new ArrayList<LoanRequest>();
        this.fund = 1000000;
        this.clock = 0;
        Savings.setDepoInterestRate(10);
        Student.setDepoInterestRate(5);
        FixedDeposit.setDepoInterestRate(15);
        System.out.println("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");
    }

    public ArrayList getAccounts() {
        return accounts;
    }

    public ArrayList getLoanRequests() {
        return loanRequests;
    }

    public void login(String loginName) {
        for(int i = 0; i < accounts.size();i++) {
            Account tempAccount = (Account)accounts.get(i);
            if(tempAccount.getAccountName().equalsIgnoreCase(loginName)) {
                loggedInAccount = tempAccount;
                System.out.println("Welcome Back, "+loggedInAccount.getAccountName());
                return;
            }
        }

        for(int i = 0; i < employees.size();i++) {
            Employee tempEmployee = (Employee) employees.get(i);
            if(tempEmployee.getName().equals(loginName)) {
                loggedInEmployee = tempEmployee;
                System.out.print(loggedInEmployee.getName()+" Active. ");
                if(loanRequests.size()>0)
                    System.out.println("There are loan approvals pending");
                return;
            }
        }
    }

    public void logout() {
        if(loggedInAccount != null) {
            System.out.println("Transcation Closed for "+loggedInAccount.getAccountName());
            loggedInAccount = null;
        }else if(loggedInEmployee != null) {
            System.out.println("Operations for "+loggedInEmployee.getName()+" closed");
            loggedInEmployee = null;
            return;
        } else {
            System.out.println("No logged in accounts");
        }
    }
    public void createAccount(String accountName, String accountType, String amount) {
        Account account = null;
        double initialAmount;
        try{
            initialAmount = Double.parseDouble(amount);
        } catch (Exception e) {
            System.out.println("Amount is not a number");
            return;
        }
        if (accountType.equalsIgnoreCase("Savings")) {
            account = new Savings(accountName, initialAmount);
        } else if (accountType.equalsIgnoreCase("Student")) {
            account = new Student(accountName, initialAmount);
        } else if (accountType.equalsIgnoreCase("FixedDeposit")) {
            account = new FixedDeposit(accountName, initialAmount);
        } else if (accountType.equalsIgnoreCase("Loan")) {
            account = new Loan(accountName, initialAmount);
        } else {
            System.out.println("invalid account type");
            return;
        }
        if(loggedInAccount != null) {
            System.out.println("You cannot create more than one account");
        } else if(loggedInEmployee != null) {
            System.out.println("You don't have access to create an account");
        } else {
            addAccount(account);
        }
    }

    private Account searchAccount(String accountName) {
        for(int i = 0; i < accounts.size();i++) {
            Account tempAccount = (Account)accounts.get(i);
            if(tempAccount.getAccountName().equals(accountName)) {
                return tempAccount;
            }
        }
        return null;
    }
    public void addAccount(Account account) {
        Account tempAccount = searchAccount(account.getAccountName());
        if(tempAccount != null) {
            System.out.println("Account name already exists");
            return;
        }
        loggedInAccount = account;
        System.out.println("Student account for "+account.getAccountName()+" Created; initial balance "+
                account.getBalance()+"$");
        accounts.add(account);
    }

    public void deposit(String number) {
        if(loggedInAccount == null) {
            System.out.println("you have to be logged in for this operation");
            return;
        }
        double amount;
        try{
            amount = Double.parseDouble(number);
        } catch (Exception e) {
            System.out.println("Amount is not a number");
            return;
        }
        loggedInAccount.deposit(amount);
    }

    public void withdraw(String number) {
        if(loggedInAccount == null) {
            System.out.println("You have to be logged in for this operation");
            return;
        }
        double amount;
        try{
            amount = Double.parseDouble(number);
        } catch (Exception e) {
            System.out.println("Amount is not a number");
            return;
        }
        loggedInAccount.withdraw(amount);
    }

    public void query() {
        if(loggedInAccount == null) {
            System.out.println("you have to be logged in for this operation");
            return;
        }
        loggedInAccount.query(true);
    }

    public void lookup(String accountName) {
        Account account = searchAccount(accountName);
        if(account == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.print(accountName+"'s ");
        account.query(false);
    }

    public void loanApplication(String number) {
        if(loggedInAccount == null) {
            System.out.println("you have to be logged in for this operation");
            return;
        }
        double amount;
        try{
            amount = Double.parseDouble(number);
        } catch (Exception e) {
            System.out.println("Amount is not a number");
            return;
        }
        if(loggedInAccount.applyForLoan(amount)) {
            addLoanRequest(new LoanRequest(loggedInAccount, amount));
        }
    }

    public boolean addLoanRequest(LoanRequest loanRequest) {
        for(int i = 0; i < loanRequests.size();i++) {
            LoanRequest temp = (LoanRequest) loanRequests.get(i);
            if(temp.getAccount().getAccountName().equals(loanRequest.getAccount().getAccountName())) {
                System.out.println("You already have a loan request pending");
                return false;
            }
        }
        System.out.println("Loan request successful, sent for approval");
        loanRequests.add(loanRequest);
        return true;
    }

    public  void approveLoan() {
        if(loggedInEmployee != null ) {
            if(loggedInEmployee.approveLoan()) {
                while(!loanRequests.isEmpty()) {
                    LoanRequest temp = (LoanRequest) loanRequests.get(loanRequests.size()-1);
                    temp.getAccount().addLoan(temp.getLoanAmount());
                    System.out.println("Loan for "+temp.getAccount().getAccountName()+" approved");
                    loanRequests.remove(temp);
                }
            }
        }
    }

    public void changeInterestRate(String accountType, String number) {
        double percentage;
        try{
            percentage = Double.parseDouble(number);
        } catch (Exception e) {
            System.out.println("Amount is not a number");
            return;
        }
        if(loggedInEmployee != null) {
            loggedInEmployee.changeInterestRate(accountType, percentage);
        } else {
            System.out.println("You don't have permission for this operation");
        }
    }

    public void showInternalFund() {
        if(loggedInEmployee != null) {
            loggedInEmployee.seeInternalFund();
        } else {
            System.out.println("You don't have permission for this operation");
        }
    }
    public void increaseClock() {
        clock++;
        System.out.println(clock+" year passed");
        for(int i = 0; i < accounts.size();i++) {
            ((Account)accounts.get(i)).increaseActiveYear();
        }
    }

    public static double getFund() {
        return fund;
    }

    public static void setFund(double changeAmount) {
        fund = fund + changeAmount;
    }


}
