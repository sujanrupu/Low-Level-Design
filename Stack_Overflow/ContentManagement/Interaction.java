package ContentManagement;

public interface Interaction {
    public void upVote(int contentId);
    public void downVote(int contentId);
    public void support(int contentId);
    public void share(int contentId);
}
