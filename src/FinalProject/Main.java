package FinalProject;

import FinalProject.controller.TaskController;
import FinalProject.data.DatabaseConnection;
import FinalProject.model.TaskModel;
import FinalProject.view.TaskView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);
        DatabaseConnection dbConnection = DatabaseConnection.getInstance(); // Singleton instance
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add a new task");
            System.out.println("2. View a task by ID");
            System.out.println("3. View all tasks");
            System.out.println("4. Delete a task by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task type (Regular, Urgent, Recurring): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character

                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();

                    // Ask if the user wants to set a reminder
                    System.out.print("Do you need a reminder? (yes/no): ");
                    String needReminder = scanner.nextLine().trim().toLowerCase();

                    if (needReminder.equals("yes")) {
                        System.out.print("Enter reminder time (yyyy-MM-dd HH:mm): ");
                        String reminderInput = scanner.nextLine();
                        LocalDateTime reminderTime = LocalDateTime.parse(reminderInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                        controller.addTaskWithReminder(type, id, name, reminderTime);
                    } else {
                        // If no reminder, just add the task without it
                        controller.addTask(type, id, name);
                    }
                    break;

                case 2:
                    System.out.print("Enter task ID to view: ");
                    int viewId = scanner.nextInt();
                    controller.showTask(viewId);
                    break;

                case 3:
                    controller.showAllTasks();
                    break;

                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    controller.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting the Task Management System. Goodbye!");
                    dbConnection.disconnect();  // Close the singleton connection if needed
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}