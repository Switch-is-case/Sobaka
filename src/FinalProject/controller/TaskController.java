package FinalProject.controller;

import FinalProject.model.TaskFactory;
import FinalProject.model.TaskModel;
import FinalProject.model.TaskModel.Task;
import FinalProject.view.TaskView;

import java.time.LocalDateTime;

public class TaskController {
    private TaskModel model;
    private TaskView view;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(String type, int taskId, String name) {
        Task task = TaskFactory.createTask(type, taskId, name);
        model.addTask(task);
        view.displayTaskAdded(task);
    }

    public void showTask(int taskId) {
        Task task = model.getTask(taskId);
        if (task != null) {
            view.displayTask(task);
        } else {
            System.out.println("No task found with ID " + taskId + ".");
        }
    }

    public void deleteTask(int taskId) {
        Task task = model.deleteTask(taskId);
        if (task != null) {
            view.displayTaskDeleted(taskId);
        } else {
            System.out.println("Task with ID " + taskId + " does not exist.");
        }
    }

    public void showAllTasks() {
        view.displayAllTasks(model.getAllTasks());
    }
    public void addTaskWithReminder(String type, int taskId, String name, LocalDateTime reminderTime) {
        Task task = TaskFactory.createTaskWithReminder(type, taskId, name, reminderTime);
        model.addTask(task);
        view.displayTaskAdded(task);
    }

}