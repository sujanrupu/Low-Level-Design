package Task;

public interface CompletedTask {
    public void checkCompletionStatus(int id);
    public void checkDeadline(int id, String date);
    public void extraTime(int hrs);
}
