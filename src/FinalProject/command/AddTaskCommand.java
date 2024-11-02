package FinalProject.command;

import FinalProject.model.TaskModel;
import FinalProject.model.TaskModel.Task;

public class AddTaskCommand implements Command {
    private TaskModel model;
    private Task task;

    public AddTaskCommand(TaskModel model, Task task) {
        this.model = model;
        this.task = task;
    }

    @Override
    public void execute() {
        model.addTask(task);
    }

    @Override
    public void undo() {
        model.deleteTask(task.getTaskId());
    }
}
