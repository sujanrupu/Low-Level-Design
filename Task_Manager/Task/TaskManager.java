package Task;

public class TaskManager implements CompletedTask, IncompleteTask{
    public void setId(int id) {
        System.out.println("Task ID: " + id + " _ assigned for the task");
    }

    public void setPriority(int id, int priority) {
        System.out.println("Priority: " + priority + ", assigned for task ID: " + id);
    }

    public void setDeadline(String date) {
        System.out.println("Final date: " + date);
    }

    @Override
    public void checkCompletionStatus(int id) {
        System.out.println("Task id: " + id + " Completed");
    }

    @Override
    public void checkDeadline(int id, String date) {
        System.out.println("Deadline for task id: " + id + ", is date: " + date);
    }

    @Override
    public void extraTime(int hrs) {
        System.out.println("Extra time needed to complete the task in hrs: " + hrs);
    }

    @Override
    public void completionPercent(int id, int complete) {
        System.out.println(complete + "% complete, for task id: " + id);
    }

    @Override
    public void estimatedTime(int hrs) {
        System.out.println("Estimated time for completion: " + hrs);
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification sent of incomplete task");
    }
}
