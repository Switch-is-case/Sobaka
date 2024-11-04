package FinalProject.command;

import FinalProject.model.ProjectModel;
import FinalProject.model.ProjectModel.Project;

public class AddProjectCommand implements Command {
    private ProjectModel model;
    private Project project;

    public AddProjectCommand(ProjectModel model, Project project) {
        this.model = model;
        this.project = project;
    }

    @Override
    public void execute() {
        model.addProject(project);
    }

    @Override
    public void undo() {
        model.deleteProject(project.getProjectId());
    }
}
