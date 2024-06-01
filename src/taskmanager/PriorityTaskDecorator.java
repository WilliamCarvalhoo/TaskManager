package taskmanager;

public class PriorityTaskDecorator extends TaskDecorator {
    private String priority;

    public PriorityTaskDecorator(Task task, String priority) {
        super(task);
        this.priority = priority;
    }

    @Override
    public void execute() {
        System.out.println("Executing " + priority + " priority task.");
        super.execute();
    }
}