import java.util.Stack;

class Task {
    private int taskId;
    private String description;

    Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    @Override
    public String toString() { return "Task " + taskId + ": " + description; }
}

class TaskManager {
    private Stack<Task> stack = new Stack<>();

    void pushTask(Task t) {
        stack.push(t);
        System.out.println("Added   -> " + t);
    }

    void popTask() {
        if (stack.isEmpty()) {
            System.out.println("No tasks to complete.");
            return;
        }
        System.out.println("Completed -> " + stack.pop());
    }

    void displayTasks() {
        if (stack.isEmpty()) {
            System.out.println("No remaining tasks.");
            return;
        }
        System.out.println("Remaining tasks (top first):");
        for (int i = stack.size() - 1; i >= 0; i--)
            System.out.println("  " + stack.get(i));
    }
}

public class TaskStackDemo {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.pushTask(new Task(1, "Write report"));
        tm.pushTask(new Task(2, "Fix bug"));
        tm.pushTask(new Task(3, "Test module"));
        tm.displayTasks();

        tm.popTask();      // most recently added task is completed first (LIFO)
        tm.displayTasks();
    }
}
