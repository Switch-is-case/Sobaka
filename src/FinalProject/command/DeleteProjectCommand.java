package FinalProject.command;

import FinalProject.model.ProjectModel;

public class DeleteProjectCommand implements Command {
    private ProjectModel model;
    private int projectId;
    private ProjectModel.Project previousProject; // To restore project if needed

    public DeleteProjectCommand(ProjectModel model, int projectId) {
        this.model = model;
        this.projectId = projectId;
    }

    @Override
    public void execute() {
        previousProject = model.getProject(projectId);
        model.deleteProject(projectId);
    }

    @Override
    public void undo() {
        if (previousProject != null) {
            model.addProject(previousProject);
        }
    }
}