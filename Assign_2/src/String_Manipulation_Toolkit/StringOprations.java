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
            if (toAppend.equals("end")) {
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

    //replace
   public static String replace(String input){
           if (input == null || input.length() == 0) {
               return "Original string is null or empty.";
           }

           System.out.println("Enter the target string to replace:");
           String target = sc.nextLine();

           System.out.println("Enter the replacement string:");
           String replacement = sc.nextLine();

           if (target == null || target.length() == 0) {
               return "Target string is null or empty.";
           }

           String result = "";
           int targetLength = target.length();

           for (int i = 0; i < input.length(); i++) {
               boolean match = true;
               if (i + targetLength <= input.length()) {
                   for (int j = 0; j < targetLength; j++) {
                       if (input.charAt(i + j) != target.charAt(j)) {
                           match = false;
                           break;
                       }
                   }
               } else {
                   match = false;
               }

               if (match) {
                   result += replacement;
                   i += targetLength - 1;
               } else {
                   result += input.charAt(i);
               }
           }

           return result;
   }

   // palindrome
    public static String isPalindrome(String input){
        if (input == null || input.length() == 0) {
            return "false";
        }
        String filtered = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isAlphanumeric(ch)) {
                filtered += Character.toLowerCase(ch);
            }
        }
        int length = filtered.length();
        for (int i = 0; i < length / 2; i++) {
            if (filtered.charAt(i) != filtered.charAt(length - i - 1)) {
                return "false";
            }
        }
        return "true";
    }
    private static boolean isAlphanumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    public static String splice(String input) {
        System.out.println("Please enter the Starting index: ");
        int stridx = sc.nextInt();
        System.out.println("Enter the length index: ");
        int endidx = sc.nextInt();

        if (stridx < 0 || stridx >= input.length() || endidx < 0 || endidx > input.length() || stridx + endidx > input.length()) {
            System.out.println("Invalid indexing. Please enter valid values.");
            return input;
        }

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i < stridx || i >= stridx + endidx) {
                result += input.charAt(i);
            }
        }
        return result;
    }

    public static String[] split(String input) {
        if (input == null || input.length() == 0) {
            return new String[0];
        }

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        String currentWord = "";
        int wordIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            } else {
                currentWord += ch;
            }
        }
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    public static String maxRepeatingCharacter(String input){
        if (input == null || input.length() == 0) {
            return "Input string is null or empty.";
        }
        input = input.toLowerCase();
        char maxChar = input.charAt(0);
        int maxCount = 1;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = currentChar;
            }
        }
        return "Character: '" + maxChar + "' -> Frequency: " + maxCount;
    }

    public static String sort(String input){
        input = input.toLowerCase();
        if (input == null || input.length() == 0) {
            return "Input string is null or empty.";
        }

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] < chars[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = chars[i];
            chars[i] = chars[minIndex];
            chars[minIndex] = temp;
        }
        return new String(chars);
    }

    public static String shift(String input) {
        int n = -1;
        while (n < 0) {
            System.out.println("Type the value of the number of characters you want to shift (positive integer):");

            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                sc.next();
            }
        }
        if (input == null || input.length() == 0) {
            return input;
        }
        int length = input.length();
        n = n % length;

        if (n == 0) {
            return input;
        }

        char[] result = new char[length];
        for (int i = 0; i < n; i++) {
            result[i] = input.charAt(length - n + i);
        }
        for (int i = n; i < length; i++) {
            result[i] = input.charAt(i - n);
        }

        return new String(result);
    }


    public static String reverse(String input){
        if (input == null || input.length() == 0) {
            return input;
        }

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
