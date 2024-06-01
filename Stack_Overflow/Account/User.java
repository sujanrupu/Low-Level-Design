package Account;

public interface User {
    public void createQuestion(String question);
    public void answerQuestion(String answer);
    public void addTag(String tag);
    public void addComment(String comment);
}
