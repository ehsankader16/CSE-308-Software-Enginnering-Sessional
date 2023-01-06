package org.example;

public class Grade {
    public static char getGrade(String marksInput, String creditInput) {
        double marks = 0, credit;
        try {
           marks = Double.parseDouble(marksInput);
           credit = Double.parseDouble(creditInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number given as input for marks");
        }
        if(credit != 3 && credit !=4) {
            throw new IllegalArgumentException("Invalid credit input");
        }
        double marksUpperLimit = credit * 100;
        double marksLowerLimit = 0;
        if(marks < marksLowerLimit) {
            throw new IllegalArgumentException("marks out of range");
        }
        double roundedMarks = Math.ceil(marks);
        if (roundedMarks > marksUpperLimit) {
            throw new IllegalArgumentException("marks out of range");
        }

        double a = marksUpperLimit * 0.8;
        double b = marksUpperLimit * 0.7;
        double c = marksUpperLimit * 0.6;

        if (roundedMarks < c){
            return 'F';
        } else if (roundedMarks < b){
            return 'C';
        } else if (roundedMarks < a){
            return 'B';
        } else {
            return 'A';
        }
    }
}
