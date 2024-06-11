package Task;

public interface IncompleteTask {
    public void completionPercent(int id, int complete);
    public void estimatedTime(int hrs);
    public void sendNotification();
}
