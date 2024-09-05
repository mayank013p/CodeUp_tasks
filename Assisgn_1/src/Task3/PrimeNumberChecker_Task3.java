
/*
Task 3: Prime Number Checker
Write a Java program to determine if a given integer is a prime number.

Owner Name: Mayank Aitan
Date of Creation: September 3, 2024
*/
package Task3;

import java.util.Scanner;

public class PrimeNumberChecker_Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a positive integer between 1 and 10^6:");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (number < 1 || number > 1000000) {
                    System.out.println("Invalid input. Please enter a number between 1 and 10^6.");
                } else if (isPrime(number)) {
                    System.out.println("The given number is PRIME");
                } else {
                    System.out.println("The given number is NOT prime");
                }
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

