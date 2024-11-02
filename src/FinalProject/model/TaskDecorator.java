package FinalProject.model;

public abstract class TaskDecorator extends TaskModel.Task {
    protected TaskModel.Task decoratedTask;

    public TaskDecorator(TaskModel.Task task) {
        super(task.getTaskId(), task.getName(), task.getPriority());
        this.decoratedTask = task;
    }

    @Override
    public String getName() {
        return decoratedTask.getName();
    }

    @Override
    public String getPriority() {
        return decoratedTask.getPriority();
    }

    @Override
    public String toString() {
        return decoratedTask.toString();
    }
}
