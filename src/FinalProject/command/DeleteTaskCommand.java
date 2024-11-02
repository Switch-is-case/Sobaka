package FinalProject.command;

import FinalProject.model.TaskModel;

public class DeleteTaskCommand implements Command {
    private TaskModel model;
    private int taskId;
    private TaskModel.Task previousTask; // To restore task if needed

    public DeleteTaskCommand(TaskModel model, int taskId) {
        this.model = model;
        this.taskId = taskId;
    }

    @Override
    public void execute() {
        previousTask = model.getTask(taskId);
        model.deleteTask(taskId);
    }

    @Override
    public void undo() {
        if (previousTask != null) {
            model.addTask(previousTask);
        }
    }
}