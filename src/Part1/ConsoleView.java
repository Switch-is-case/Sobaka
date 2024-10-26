import java.util.Scanner;

public class ConsoleView {
    // displaying information
    // gather input
    // front of your project
    // OUTPUT IN THE CONSULE
    private Scanner scanner;

    public ConsoleView() {
        // Corrected Scanner initialization
        scanner = new Scanner(System.in);
    }

    // Display a message to the user
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Gather input from the user
    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }
}
