package FinalProject.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectModel {
    private Map<Integer, Project> projects = new HashMap<>();
    private List<ProjectObserver> observers = new ArrayList<>();

    // Inner class representing the base Project
    public static abstract class Project {
        protected int projectId;
        protected String name;
        protected String priority;

        protected String status;

        public Project(int projectId, String name, String priority) {
            this.projectId = projectId;
            this.name = name;
            this.priority = priority;
            this.status = "not started";
        }

        public int getProjectId() {
            return projectId;
        }

        public String getName() {
            return name;
        }

        public String getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "[" + projectId + "] " + name + " (Priority: " + priority + ")";
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    // Regular Project subclass
    public static class RegularProject extends Project {
        public RegularProject(int projectId, String name) {
            super(projectId, name, "Regular");
        }
    }

    // Urgent Project subclass
    public static class UrgentProject extends Project {
        public UrgentProject(int projectId, String name) {
            super(projectId, name, "Urgent");
        }
    }

    // Recurring Project subclass
    public static class RecurringProject extends Project {
        public RecurringProject(int projectId, String name) {
            super(projectId, name, "Recurring");
        }
    }

    public void addObserver(ProjectObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ProjectObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (ProjectObserver observer : observers) {
            observer.update(message);
        }
    }

    public void addProject(Project project) {
        projects.put(project.getProjectId(), project);
        notifyObservers("Project added: " + project.getName());
    }

    public Project getProject(int projectId) {
        return projects.get(projectId);
    }

    public Project deleteProject(int projectId) {
        Project project = projects.remove(projectId);
        if (project != null) {
            notifyObservers("Project deleted: " + project.getName());
        }
        return project;
    }

    public void updateProjectStatus(int projectId, String newStatus) {
        Project project = projects.get(projectId);
        if (project != null) {
            project.setStatus(newStatus);
            notifyObservers("Project status updated: " + project.getName() + " is now " + newStatus);
        } else {
            System.out.println("Project not found for ID: " + projectId);
        }
    }

    public Map<Integer, Project> getAllProjects() {
        return projects;
    }
}
