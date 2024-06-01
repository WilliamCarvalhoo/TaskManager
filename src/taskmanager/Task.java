package taskmanager;

public interface Task {
    void execute();
    void complete();
    boolean isCompleted();
}