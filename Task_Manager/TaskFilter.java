import Task.TaskManager;

public class TaskFilter extends TaskManager {
    public void setFilter(String filter) {
        System.out.println(filter + " filter applied");
    }
    public void extractTask(int id, int priority) {
        System.out.println("Task of id: " + id + "of priority: " + priority + " extracted applying filter");
    }
}
