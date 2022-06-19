package assignment3a;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CalculatorAdapter {
    private final Calculator calculator;

    public CalculatorAdapter() {
        this.calculator = new Calculator();
    }

    public int  calculateSum(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                lines.add(line.replace('~', ' '));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        String modifiedFileName = "modifiedInput.txt";
        try {
            FileWriter fw = new FileWriter(modifiedFileName);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return calculator.calculateSum(modifiedFileName);
    }
}
