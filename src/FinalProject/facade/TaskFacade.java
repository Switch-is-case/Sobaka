package FinalProject.facade;

import FinalProject.controller.TaskController;
import FinalProject.model.TaskModel;
import FinalProject.view.TaskView;

public class TaskFacade {
    private TaskController controller;

    public TaskFacade(TaskModel model, TaskView view) {
        this.controller = new TaskController(model, view);
    }

    public void addTask(String type, int taskId, String name) {
        controller.addTask(type, taskId, name);
    }

    public void deleteTask(int taskId) {
        controller.deleteTask(taskId);
    }

    public void showTask(int taskId) {
        controller.showTask(taskId);
    }

    public void showAllTasks() {
        controller.showAllTasks();
    }
}
