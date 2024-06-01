package Account;

public interface Moderator {
    public void checkContent(int contentId);
    public void deleteQuestion(String question);
    public void checkGuidelines();
    public void pushNotification(int userId, int contentId);
}
