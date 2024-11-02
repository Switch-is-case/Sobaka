package FinalProject.view;

import FinalProject.model.TaskModel.Task;

import java.util.Map;

public class TaskView {

    public void displayTask(Task task) {
        System.out.println(task);
    }

    public void displayAllTasks(Map<Integer, Task> tasks) {
        System.out.println("All Tasks:");
        tasks.values().forEach(task -> System.out.println(" - " + task));
    }

    public void displayTaskAdded(Task task) {
        System.out.println("Task '" + task.getName() + "' added with priority " + task.getPriority() + ".");
    }

    public void displayTaskDeleted(int taskId) {
        System.out.println("Task with ID " + taskId + " has been deleted.");
    }
}