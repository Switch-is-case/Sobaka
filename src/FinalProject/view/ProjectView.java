package FinalProject.view;

import FinalProject.model.ProjectModel.Project;

import java.util.Map;

public class ProjectView {

    public void displayProject(Project project) {
        System.out.println("Project Details:");
        System.out.println(" - ID: " + project.getProjectId());
        System.out.println(" - Name: " + project.getName());
        System.out.println(" - Priority: " + project.getPriority());
        System.out.println(" - Status: " + project.getStatus()); // Include the status
    }

    public void displayAllProjects(Map<Integer, Project> projects) {
        System.out.println("All Projects:");
        projects.values().forEach(project -> System.out.println(" - " + project));
    }

    public void displayProjectAdded(Project project) {
        System.out.println("Project '" + project.getName() + "' added with priority " + project.getPriority() + ".");
    }

    public void displayProjectDeleted(int projectId) {
        System.out.println("Project with ID " + projectId + " has been deleted.");
    }

    public void displayProjectStatusUpdated(Project project) {
        System.out.println("Project '" + project.getName() + "' status updated to " + project.getStatus() + ".");
    }
}
