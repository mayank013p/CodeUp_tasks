package String_Manipulation_Toolkit;

import java.util.Scanner;

public class Main {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Hello, Welcome to the String manipulation toolkit");
          while (true) {

               System.out.println("Enter The String (e.g. 'Sachin') or 'exit' to quit: ");
               String input = sc.nextLine();
               if (input == "exit") {
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
//               case "3":
//               case "Replace":
//                    stringOps.replace(input);
//                    break;
//               case "4":
//               case "isPalindrome":
//                    stringOps.isPalindrome(input);
//                    break;
//               case "5":
//               case "Splice":
//                    stringOps.splice(input);
//                    break;
//               case "6":
//               case "Split":
//                    stringOps.split(input);
//                    break;
//               case "7":
//               case "MaxRepeatingCharacter":
//                    stringOps.maxRepeatingCharacter(input);
//                    break;
//               case "8":
//               case "Sort":
//                    stringOps.sort(input);
//                    break;
//               case "9":
//               case "Shift":
//                    stringOps.shift(input);
//                    break;
//               case "10":
//               case "Reverse":
//                    stringOps.reverse(input);
//                    break;
//               case "11":
//               case "Exit":
//                    System.out.println("Exiting the operation menu.");
//                    break;
               default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
          }
     }
}
