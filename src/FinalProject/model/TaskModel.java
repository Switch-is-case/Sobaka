package FinalProject.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskModel {
    private Map<Integer, Task> tasks = new HashMap<>();
    private List<TaskObserver> observers = new ArrayList<>();

    // Inner class representing the base Task
    public static abstract class Task {
        protected int taskId;
        protected String name;
        protected String priority;

        public Task(int taskId, String name, String priority) {
            this.taskId = taskId;
            this.name = name;
            this.priority = priority;
        }

        public int getTaskId() {
            return taskId;
        }

        public String getName() {
            return name;
        }

        public String getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "[" + taskId + "] " + name + " (Priority: " + priority + ")";
        }
    }

    // Regular Task subclass
    public static class RegularTask extends Task {
        public RegularTask(int taskId, String name) {
            super(taskId, name, "Regular");
        }
    }

    // Urgent Task subclass
    public static class UrgentTask extends Task {
        public UrgentTask(int taskId, String name) {
            super(taskId, name, "Urgent");
        }
    }

    // Recurring Task subclass
    public static class RecurringTask extends Task {
        public RecurringTask(int taskId, String name) {
            super(taskId, name, "Recurring");
        }
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (TaskObserver observer : observers) {
            observer.update(message);
        }
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
        notifyObservers("Task added: " + task.getName());
    }

    public Task getTask(int taskId) {
        return tasks.get(taskId);
    }

    public Task deleteTask(int taskId) {
        Task task = tasks.remove(taskId);
        if (task != null) {
            notifyObservers("Task deleted: " + task.getName());
        }
        return task;
    }

    public Map<Integer, Task> getAllTasks() {
        return tasks;
    }
}