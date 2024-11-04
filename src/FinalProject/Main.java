package FinalProject;

import FinalProject.controller.ProjectController;  // Updated import
import FinalProject.data.DatabaseConnection;
import FinalProject.model.ProjectModel;
import FinalProject.view.ProjectView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProjectModel model = new ProjectModel();
        ProjectView view = new ProjectView();
        ProjectController controller = new ProjectController(model, view);  // Updated to ProjectController
        DatabaseConnection dbConnection = DatabaseConnection.getInstance(); // Singleton instance
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nProject Management System");
            System.out.println("1. Add a new project");  // Updated text
            System.out.println("2. View a project by ID");  // Updated text
            System.out.println("3. View all projects");  // Updated text
            System.out.println("4. Delete a project by ID");  // Updated text
            System.out.println("5. Update project status");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter project type (Regular, Urgent, Recurring): ");  // Updated text
                    String type = scanner.nextLine();

                    System.out.print("Enter project ID: ");  // Updated text
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character

                    System.out.print("Enter project name: ");  // Updated text
                    String name = scanner.nextLine();

                    // Ask if the user wants to set a reminder
                    System.out.print("Do you need a reminder? (yes/no): ");
                    String needReminder = scanner.nextLine().trim().toLowerCase();

                    if (needReminder.equals("yes")) {
                        System.out.print("Enter reminder time (yyyy-MM-dd HH:mm): ");
                        String reminderInput = scanner.nextLine();
                        LocalDateTime reminderTime = LocalDateTime.parse(reminderInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                        controller.addProjectWithReminder(type, id, name, reminderTime);  // Updated method call
                    } else {
                        // If no reminder, just add the project without it
                        controller.addProject(type, id, name);  // Updated method call
                    }
                    break;

                case 2:
                    System.out.print("Enter project ID to view: ");  // Updated text
                    int viewId = scanner.nextInt();
                    controller.showProject(viewId);  // Updated method call
                    break;

                case 3:
                    controller.showAllProjects();  // Updated method call
                    break;

                case 4:
                    System.out.print("Enter project ID to delete: ");  // Updated text
                    int deleteId = scanner.nextInt();
                    controller.deleteProject(deleteId);  // Updated method call
                    break;

                case 5: // Add this case for updating project status
                    System.out.print("Enter project ID to update status: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.print("Enter new status (in progress, completed, etc.): ");
                    String newStatus = scanner.nextLine();

                    controller.updateProjectStatus(updateId, newStatus);
                    break;

                case 6:
                    System.out.println("Exiting the Project Management System. Goodbye!");  // Updated text
                    dbConnection.disconnect();  // Close the singleton connection if needed
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
