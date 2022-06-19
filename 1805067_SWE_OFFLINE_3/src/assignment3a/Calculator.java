package assignment3a;

import java.io.BufferedReader;
import java.io.FileReader;

public class Calculator {
    public int  calculateSum(String fileName) {
        int sum = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while(true) {
                String line = br.readLine();
                if (line == null) break;
                String[] numbers = line.split(" ");
                for(String number : numbers) {
                    sum += Integer.parseInt(number);;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
}
