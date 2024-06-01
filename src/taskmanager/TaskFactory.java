package taskmanager;

public class TaskFactory {
    public static Task createTask(String type, String description) {
        switch (type.toLowerCase()) {
            case "basic":
                return new BasicTask(description);
            default:
                throw new IllegalArgumentException("Unknown task type");
        }
    }
}
