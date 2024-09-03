package Task4;

/*
Task 4: Number to Words Converter
Write a Java program that converts a given integer into its written English form.

Owner Name: Mayank Aitan
Date of Creation: September 3, 2024
*/

import java.util.Scanner;

public class NumberToWordsConverter_Task4 {

    // Array of words for numbers less than 20
    private static final String[] LESS_THAN_TWENTY = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String HUNDRED = "hundred";
    private static final String THOUSAND = "thousand";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Enter a positive integer between 1 and 1000, or type 'exit' to quit:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < 1 || number > 1000) {
                    System.out.println("Invalid input. Please enter a number between 1 and 1000.");
                } else {
                    String result = convertNumberToWords(number);
                    System.out.println("Output: \"" + result + "\"");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    continueRunning = false;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer or type 'exit' to quit.");
                }
            }
        }

        System.out.println("Program terminated.");
        scanner.close();
    }

    private static String convertNumberToWords(int number) {
        if (number == 0) {
            return ""; 
        }

        if (number < 20) {
            return LESS_THAN_TWENTY[number];
        }

        if (number < 100) {
            return TENS[number / 10] + (number % 10 > 0 ? " " + convertNumberToWords(number % 10) : "");
        }

        if (number < 1000) {
            return LESS_THAN_TWENTY[number / 100] + " " + HUNDRED + 
                   (number % 100 > 0 ? " " + convertNumberToWords(number % 100) : "");
        }
        if (number == 1000) {
            return "one thousand";
        }

        return "";
    }
}
