package Assignment1.Logger;

import java.util.Scanner;
// i import Scanner
public class Main {
    public static void main(String[] args) {
        //there i am adding scanner
        Scanner scanner = new Scanner(System.in);
        // there i will get the single instance of Assignment1.Logger.Assignment1.Logger
        Logger logger = Logger.getInstance();

        // there i will log messages using the Assignment1.Logger.Assignment1.Logger instance
        // this code is for writing some message to terminal
        String Message = scanner.nextLine();
        // with this i will go tho the Assignment1.Logger.Assignment1.Logger and will print message to the terminal
        logger.LogToConsole(Message);
    }
}
