public class Cashier extends Employee{
    public Cashier(String name) {
        super(name);
    }

    @Override
    public boolean approveLoan() {
        System.out.println("You don’t have permission for this operation");
        return false;
    }

    @Override
    public boolean changeInterestRate(String accountType, double percentage) {
        System.out.println("You don’t have permission for this operation");
        return false;
    }

}
