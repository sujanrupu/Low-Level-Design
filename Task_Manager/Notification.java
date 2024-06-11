public class Notification {
    public void generate(int id, String date, int taskId) {
        System.out.println("Notification generated on: " + date + ", on: " + date + ", for task ID: " + taskId);
    }
    public void setContent(String content) {
        System.out.println("Notification content: " + content);
    }
    public void validateAccess(int id) {
        System.out.println("Notification access validated for user ID: " + id);
    }
    public void repeat(int n) {
        System.out.println("The notification sent for : " + n + "th time");
    }
}
