public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean approveLoan() {
        return true;
    }

    public boolean changeInterestRate(String accountType, double percentage) {
        System.out.println("You don’t have permission for this operation");
        return false;
    }

    public boolean seeInternalFund() {
        System.out.println("You don’t have permission for this operation");
        return false;
    }
}
