package Task1;

public class Handler {

    public String getUserInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the string to expand (e.g., 'a1b12c3'), or 'exit' to quit:");
        return scanner.nextLine();
    }

    public void displayResult(String result) {
        if (result != null) {
            System.out.println("Expanded String: " + result);
        } else {
            System.out.println("Invalid input. Please enter a valid string.");
        }
    }

    public void displayExitMessage() {
        System.out.println("Exiting...");
    }
}

