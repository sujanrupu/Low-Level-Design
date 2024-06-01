package ContentManagement;

public interface Moderation {
    public void setModerationIssue(int contentId);
    public void removeContent(int contentId);
    public void sendModerationNotification(int userId, int contentId);
}
