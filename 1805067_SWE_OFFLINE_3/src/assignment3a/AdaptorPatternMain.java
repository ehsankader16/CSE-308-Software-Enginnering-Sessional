package assignment3a;

public class AdaptorPatternMain {
    public static void main(String[] args) {
        CalculatorAdapter adapter = new CalculatorAdapter();
        System.out.println("The sum of the numbers in the file is: " + adapter.calculateSum("input.txt"));
    }
}