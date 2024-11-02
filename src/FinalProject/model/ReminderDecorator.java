package FinalProject.model;

import java.time.LocalDateTime;

public class ReminderDecorator extends TaskDecorator {
    private LocalDateTime reminderTime;

    public ReminderDecorator(TaskModel.Task task, LocalDateTime reminderTime) {
        super(task);
        this.reminderTime = reminderTime;
    }

    @Override
    public String toString() {
        return super.toString() + " [Reminder set for: " + reminderTime + "]";
    }

    public LocalDateTime getReminderTime() {
        return reminderTime;
    }
}