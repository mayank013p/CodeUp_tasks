/***
 * Object : Longest Substring Without Repeating Characters 
 * 				      Given a string s, find the length of the longest substring without repeating characters.
 * Owner : Mayank Aitan
 * Date of Creation : 3 sep, 2024
 */


 package Task5;
 import java.util.Scanner;
 
 public class LongSubString_Task5 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Prompt user for input
         System.out.println("Enter a string to find the length of the longest substring without repeating characters: ");
         String s = scanner.nextLine();
 
         int length = lengthOfLongestSubstring(s);
         System.out.println("Length : " + length);
 
         // Close the scanner
         scanner.close();
     }
 
     public static int lengthOfLongestSubstring(String s) {
         int[] charIndex = new int[256]; 
         int maxLength = 0;
         int start = 0;
         int n = s.length();
 
         for (int i = 0; i < 256; i++) {
             charIndex[i] = -1;
         }
 
         for (int end = 0; end < n; end++) {
             char currentChar = s.charAt(end);
             if (charIndex[currentChar] >= start) {
                 start = charIndex[currentChar] + 1;
             }
 
             charIndex[currentChar] = end;
             maxLength = Math.max(maxLength, end - start + 1);
         }
 
         return maxLength;
     }
 }
 