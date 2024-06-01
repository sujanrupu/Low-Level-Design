package Account;

public class AccountManager implements User, Moderator{
    @Override
    public void createQuestion(String question) {
        System.out.println("Question created, question: " + question);
    }

    @Override
    public void answerQuestion(String answer) {
        System.out.println("Answer posted successfully, answer: " + answer);
    }

    @Override
    public void addTag(String tag) {
        System.out.println(tag + " Tag added to the content");
    }

    @Override
    public void addComment(String comment) {
        System.out.println(comment + " added to the content");
    }

    @Override
    public void checkContent(int contentId) {
        System.out.println("All checks passed for contentID: " + contentId);
    }

    @Override
    public void deleteQuestion(String question) {
        System.out.println(question + " Question deleted");
    }

    @Override
    public void checkGuidelines() {
        System.out.println("All guidelines checks successful");
    }

    @Override
    public void pushNotification(int userId, int contentId) {
        System.out.println("Notification sent to user: " + userId + " for content: " + contentId);
    }
}
