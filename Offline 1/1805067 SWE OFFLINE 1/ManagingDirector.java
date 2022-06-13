public class ManagingDirector extends Employee{
    public ManagingDirector(String name) {
        super(name);
    }

    @Override
    public boolean changeInterestRate(String accountType, double percentage) {
        if (accountType.equalsIgnoreCase("Savings")) {
            Savings.setDepoInterestRate(percentage);
        } else if (accountType.equalsIgnoreCase("Student")) {
            Student.setDepoInterestRate(percentage);
        } else if (accountType.equalsIgnoreCase("FixedDeposit")) {
            FixedDeposit.setDepoInterestRate(percentage);
        } else if (accountType.equalsIgnoreCase("Loan")) {
            System.out.println("Invalid operation");
        } else {
            System.out.println("invalid account type");
        }
        return true;
    }

    @Override
    public boolean seeInternalFund() {
        System.out.println("Total internal fund"+ Bank.getFund());
        return false;
    }
}
