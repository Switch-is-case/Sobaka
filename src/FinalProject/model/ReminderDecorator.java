package FinalProject.model;

import java.time.LocalDateTime;

public class ReminderDecorator extends ProjectDecorator {
    private LocalDateTime reminderTime;

    public ReminderDecorator(ProjectModel.Project project, LocalDateTime reminderTime) {
        super(project);
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
