package taskmanager;

public class BasicTask implements Task {
    private String description;
    private boolean completed;

    public BasicTask(String description) {
        this.description = description;
        this.completed = false;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + description);
    }

    @Override
    public void complete() {
        this.completed = true;
        System.out.println("Task completed: " + description);
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }
}