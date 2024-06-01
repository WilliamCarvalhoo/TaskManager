package taskmanager;

public abstract class TaskDecorator implements Task {
    protected Task decoratedTask;

    public TaskDecorator(Task task) {
        this.decoratedTask = task;
    }

    @Override
    public void execute() {
        decoratedTask.execute();
    }

    @Override
    public void complete() {
        decoratedTask.complete();
    }

    @Override
    public boolean isCompleted() {
        return decoratedTask.isCompleted();
    }
}
