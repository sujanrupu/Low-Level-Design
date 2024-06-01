package ContentManagement;

public class ManagementManager implements Interaction, Moderation {
    @Override
    public void upVote(int contentId) {
        System.out.println(contentId + " content up-voted");
    }

    @Override
    public void downVote(int contentId) {
        System.out.println(contentId + " content down-voted");
    }

    @Override
    public void support(int contentId) {
        System.out.println(contentId + " content supported");
    }

    @Override
    public void share(int contentId) {
        System.out.println(contentId + " content sharable link generated");
    }

    @Override
    public void setModerationIssue(int contentId) {
        System.out.println("Moderation issue detected for the content: " + contentId);
    }

    @Override
    public void removeContent(int contentId) {
        System.out.println("Content removed if ID: " + contentId);
    }

    @Override
    public void sendModerationNotification(int userId, int contentId) {
        System.out.println("Moderation status notification sent to useID: " + userId + " with contentID: " + contentId);
    }
}
