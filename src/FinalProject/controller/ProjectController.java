package FinalProject.controller;

import FinalProject.model.ProjectFactory;
import FinalProject.model.ProjectModel;
import FinalProject.model.ProjectModel.Project;
import FinalProject.view.ProjectView;

import java.time.LocalDateTime;

public class ProjectController {
    private ProjectModel model;
    private ProjectView view;

    public ProjectController(ProjectModel model, ProjectView view) {
        this.model = model;
        this.view = view;
    }

    public void addProject(String type, int projectId, String name) {
        Project project = ProjectFactory.createProject(type, projectId, name);
        model.addProject(project);
        view.displayProjectAdded(project);
    }

    public void showProject(int projectId) {
        Project project = model.getProject(projectId);
        if (project != null) {
            view.displayProject(project);
        } else {
            System.out.println("No project found with ID " + projectId + ".");
        }
    }

    public void deleteProject(int projectId) {
        Project project = model.deleteProject(projectId);
        if (project != null) {
            view.displayProjectDeleted(projectId);
        } else {
            System.out.println("Project with ID " + projectId + " does not exist.");
        }
    }

    public void showAllProjects() {
        view.displayAllProjects(model.getAllProjects());
    }

    public void addProjectWithReminder(String type, int projectId, String name, LocalDateTime reminderTime) {
        Project project = ProjectFactory.createProjectWithReminder(type, projectId, name, reminderTime);
        model.addProject(project);
        view.displayProjectAdded(project);
    }

    public void updateProjectStatus(int projectId, String newStatus) {
        model.updateProjectStatus(projectId, newStatus);
        Project project = model.getProject(projectId);
        if (project != null) {
            view.displayProjectStatusUpdated(project);
        } else {
            System.out.println("No project found with ID " + projectId + ".");
        }
    }
}
