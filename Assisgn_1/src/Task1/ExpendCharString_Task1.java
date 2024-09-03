/**
 * Task 1: Expand Compressed String
 * 
 * This program expands a compressed string where each letter is followed by a number representing the repeat count.
 * For example, 'a1b12c3' expands to 'abbcccccccccccc'.
 * 
 * Owner Name: Mayank Aitan
 * Date of Creation: September 2, 2024
 */
package Task1;

public class ExpendCharString_Task1 {

    private static final int MAX_REPEAT_COUNT = 1000;

    public static void main(String[] args) {
        Handler outputHandler = new Handler();

        while (true) {
            String input = outputHandler.getUserInput();

            if ("exit".equalsIgnoreCase(input)) {
                outputHandler.displayExitMessage();
                break;
            }

            String result = expandString(input);
            outputHandler.displayResult(result);
        }
    }

    private static String expandString(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String expandedString = "";
        int length = input.length();

        for (int i = 0; i < length; ) {
            char currentChar = input.charAt(i);

            if (currentChar < 'a' || currentChar > 'z') {
                return null;
            }
            i++;
            int repeatCount = 0;

            for (; i < length && input.charAt(i) >= '0' && input.charAt(i) <= '9'; i++) {
                repeatCount = repeatCount * 10 + (input.charAt(i) - '0');
            }

            if (repeatCount <= 0 || repeatCount > MAX_REPEAT_COUNT) {
                return null;
            }

            for (int j = 0; j < repeatCount; j++) {
                expandedString += currentChar;
            }
        }

        return expandedString;
    }
}


