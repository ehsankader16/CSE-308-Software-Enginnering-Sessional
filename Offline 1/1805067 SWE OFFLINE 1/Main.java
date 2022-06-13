import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        operationsHandler(bank);
    }

    public static void operationsHandler(Bank bank) {
        while (true) {
            String input;
            Scanner scn = new Scanner(System.in);
            input = scn.nextLine();
            String inputs[] = input.split(" ");
            if(input.equalsIgnoreCase("Approve Loan")) {
                bank.approveLoan();
            } else if (inputs[0].equalsIgnoreCase("Create") && inputs.length == 4) {
                bank.createAccount(inputs[1], inputs[2], inputs[3]);
            } else if (inputs[0].equalsIgnoreCase("Open") && inputs.length == 2) {
                bank.login(inputs[1]);
            } else if (inputs[0].equalsIgnoreCase("Close") && inputs.length == 1) {
                bank.logout();
            } else if (inputs[0].equalsIgnoreCase("Deposit") && inputs.length == 2) {
                bank.deposit(inputs[1]);
            } else if (inputs[0].equalsIgnoreCase("Withdraw") && inputs.length == 2) {
                bank.withdraw(inputs[1]);
            } else if (inputs[0].equalsIgnoreCase("Query") && inputs.length == 1) {
                bank.query();
            } else if (inputs[0].equalsIgnoreCase("Lookup") && inputs.length == 2) {
                bank.lookup(inputs[1]);
            } else if (inputs[0].equalsIgnoreCase("Request") && inputs.length == 2) {
                bank.loanApplication(inputs[1]);
            } else if (inputs[0].equalsIgnoreCase("Change") && inputs.length == 3) {
                bank.changeInterestRate(inputs[1], inputs[2]);
            } else if (inputs[0].equalsIgnoreCase("See") && inputs.length == 1) {
                bank.showInternalFund();
            } else if (inputs[0].equalsIgnoreCase("INC")) {
                bank.increaseClock();
            } else if (inputs[0].equalsIgnoreCase("Exit")) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}