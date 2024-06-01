package taskmanager;

public class TaskManagerDemo {
    public static void main(String[] args) {
        TaskRepository taskRepository = TaskRepository.getInstance();

        Task task1 = TaskFactory.createTask("basic", "Task 1: Write Unit Tests");
        Task task2 = TaskFactory.createTask("basic", "Task 2: Implement Feature X");

        taskRepository.addTask(task1);
        taskRepository.addTask(task2);

        Task priorityTask = new PriorityTaskDecorator(task1, "High");

        priorityTask.execute();
        priorityTask.complete();

        TaskNotifier notifier = new TaskNotifier();
        notifier.addObserver(task -> System.out.println("Notification: Task " + (task.isCompleted() ? "completed" : "not completed")));

        notifier.notifyObservers(priorityTask);

        for (Task task : taskRepository.getTasks()) {
            task.execute();
        }
    }
}
