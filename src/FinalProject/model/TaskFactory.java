package FinalProject.model;

import FinalProject.model.TaskModel.*;
import java.time.LocalDateTime;

public class TaskFactory {

    public static Task createTask(String type, int taskId, String name) {
        switch (type.toLowerCase()) {
            case "regular":
                return new RegularTask(taskId, name);
            case "urgent":
                return new UrgentTask(taskId, name);
            case "recurring":
                return new RecurringTask(taskId, name);
            default:
                throw new IllegalArgumentException("Unknown task type: " + type);
        }
    }

    public static Task createTaskWithReminder(String type, int taskId, String name, LocalDateTime reminderTime) {
        Task task = createTask(type, taskId, name);
        return new ReminderDecorator(task, reminderTime);
    }
}
