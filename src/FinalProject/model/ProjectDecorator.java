package FinalProject.model;

public abstract class ProjectDecorator extends ProjectModel.Project {
    protected ProjectModel.Project decoratedProject;

    public ProjectDecorator(ProjectModel.Project project) {
        super(project.getProjectId(), project.getName(), project.getPriority());
        this.decoratedProject = project;
    }

    @Override
    public String getName() {
        return decoratedProject.getName();
    }

    @Override
    public String getPriority() {
        return decoratedProject.getPriority();
    }

    @Override
    public String toString() {
        return decoratedProject.toString();
    }
}

