import Task.TaskManager;

public class TaskTransfer extends TaskManager {
    public void sendTask(int taskId, int id) {
        System.out.println("Task of id: " + taskId + "transferred from : " + id);
    }
    public void receiveTask(int taskId, int id) {
        System.out.println("Task of id: " + taskId + "transferred to: " + id);
    }
    public void sendNotification() {
        System.out.println("Task transfer successful");
    }
}
