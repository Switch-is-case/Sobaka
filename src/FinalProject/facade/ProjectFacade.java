package FinalProject.facade;

import FinalProject.controller.ProjectController;
import FinalProject.model.ProjectModel;
import FinalProject.view.ProjectView;

public class ProjectFacade {
    private ProjectController controller;

    public ProjectFacade(ProjectModel model, ProjectView view) {
        this.controller = new ProjectController(model, view);
    }

    public void addProject(String type, int projectId, String name) {
        controller.addProject(type, projectId, name);
    }

    public void deleteProject(int projectId) {
        controller.deleteProject(projectId);
    }

    public void showProject(int projectId) {
        controller.showProject(projectId);
    }

    public void showAllProjects() {
        controller.showAllProjects();
    }
}

