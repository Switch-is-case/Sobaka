package FinalProject.model;

import FinalProject.model.ProjectModel.*;
import java.time.LocalDateTime;

public class ProjectFactory {

    public static Project createProject(String type, int projectId, String name) {
        switch (type.toLowerCase()) {
            case "regular":
                return new RegularProject(projectId, name);
            case "urgent":
                return new UrgentProject(projectId, name);
            case "recurring":
                return new RecurringProject(projectId, name);
            default:
                throw new IllegalArgumentException("Unknown project type: " + type);
        }
    }

    public static Project createProjectWithReminder(String type, int projectId, String name, LocalDateTime reminderTime) {
        Project project = createProject(type, projectId, name);
        return new ReminderDecorator(project, reminderTime);
    }
}
