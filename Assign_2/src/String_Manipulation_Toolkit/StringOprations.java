package String_Manipulation_Toolkit;

import java.util.Scanner;

public class StringOprations {

    public static Scanner sc = new Scanner(System.in);

    //append
    public static String append(String input) {
        String result = input;

        while (true) {
            System.out.println("Enter the string to append (or type 'end' to stop): ");
            String toAppend = sc.nextLine();
            if (toAppend=="end") {
                break;
            }
            result += toAppend;
            System.out.println("Current result: " + result);
        }

        return result;

    }

    //countwords
    public static int countWords(String input) {
        if (input == null) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                if (inWord) {
                    inWord = false;
                }
            } else {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            }
        }
        return wordCount;
    }

//    public static String replace(String input){
//
//    }
//
//    public static String isPalindrome(String input){
//
//    }
//
//    public static String splice(String input){
//
//    }
//
//    public static String split(String input){
//
//    }
//
//    public static String maxRepeatingCharacter(String input){
//
//    }
//
//    public static String sort(String input){
//
//    }
//
//    public static String shift(String input){
//
//    }
//
//    public static String reverse(String input){
//
//    }
}
