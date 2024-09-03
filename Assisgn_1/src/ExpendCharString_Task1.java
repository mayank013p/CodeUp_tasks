import java.util.Scanner;

public class ExpendCharString_Task1{
   
    public static String expandString(String s) {
        String result = "";
        int length = s.length();
    
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
    
            if (Character.isLetter(ch)) {
                // Default count is 1 (if no digit follows)
                int count = 1;
                int j = i + 1;
    
                // Check if the next character is a digit
                if (j < length && Character.isDigit(s.charAt(j))) {
                    count = 0;
                    while (j < length && Character.isDigit(s.charAt(j))) {
                        // Build the number if it has more than one digit
                        count = count * 10 + (s.charAt(j) - '0');
                        j++;
                    }
                    i = j - 1; // Skip all digits in the next iteration
                }
    
                // Append the character 'count' times to the result string
                for (int k = 0; k < count; k++) {
                    result += ch;
                }
            }
        }
        // Return the expanded string to the main function
        return result;
    }
   
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = expandString(input);
        System.out.println(output); 
    }
}
