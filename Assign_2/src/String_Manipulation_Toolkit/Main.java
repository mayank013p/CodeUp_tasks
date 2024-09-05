/***
 * Task: The user will first enter a string. After that, the program should ask the user which operation they want to execute on the string.
         The available operations are listed below:
         Append, CountWords, Replace, isPalindrome, Splice, Split, MaxRepeatingCharacter,Sort, Shift, and Reverse.
         Each method should perform its respective operation based on the user's input.
 * Owner: Mayank Aitan
 * Date of Creation: 5 Sep,2024
 */
package String_Manipulation_Toolkit;
import java.util.Scanner;

public class Main {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Hello, Welcome to the String manipulation toolkit");
          while (true) {

               System.out.println("Enter The String (e.g. 'Sachin') or 'exit' to quit: ");
               String input = sc.nextLine();
               if (input.equals("exit")) {
                    System.out.println("Exiting the program, Thanks!");
                    break;
               }else{
                    user(input);
               }
          }
     }


     public static void user(String input) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Choose an operation with name or number (e.g. for append choose '1' or 'Append'): ");
          System.out.println("1. Append");
          System.out.println("2. CountWords");
          System.out.println("3. Replace");
          System.out.println("4. isPalindrome");
          System.out.println("5. Splice");
          System.out.println("6. Split");
          System.out.println("7. MaxRepeatingCharacter");
          System.out.println("8. Sort");
          System.out.println("9. Shift");
          System.out.println("10. Reverse");
          System.out.println("11. Exit");

          String choice = sc.nextLine();

          StringOprations stringOps = new StringOprations();

          switch (choice) {
               case "1":
               case "Append":
                    stringOps.append(input);
                    break;
               case "2":
               case "CountWords":
                    System.out.println(stringOps.countWords(input));
                    break;
              case "3":
              case "Replace":
                   System.out.println(stringOps.replace(input));
                   break;
               case "4":
               case "isPalindrome":
                    System.out.println(stringOps.isPalindrome(input));
                    break;
               case "5":
               case "Splice":
                    System.out.println(stringOps.splice(input));
                    break;
               case "6":
               case "Split":
                    String[] words = stringOps.split(input);
                    System.out.println("Split words:");
                    for (String word : words) {
                         System.out.println(word);
                    }
                    break;
               case "7":
               case "MaxRepeatingCharacter":
                    System.out.println(stringOps.maxRepeatingCharacter(input));
                    break;
               case "8":
               case "Sort":
                    System.out.println(stringOps.sort(input));
                    break;
               case "9":
               case "Shift":
                    System.out.println(stringOps.shift(input));
                    break;
               case "10":
               case "Reverse":
                    System.out.println(stringOps.reverse(input));
                    break;
               case "11":
               case "Exit":
                    System.out.println("Exiting the operation menu.");
                    break;
               default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
          }
     }
}
