import Account.AccountManager;
import ContentCreation.CreationManager;
import ContentManagement.ManagementManager;

public class Main {
    public static void main(String[] args) {
        // Creating instances of various managers
        AccountManager accountManager = new AccountManager();
        CreationManager creationManager = new CreationManager();
        ManagementManager managementManager = new ManagementManager();

        // Demonstrating functionalities
        accountManager.createQuestion("How to use Java Streams?");
        creationManager.makeQuestion();
        managementManager.upVote(1234);

        accountManager.answerQuestion("Java Streams can be used for processing collections of objects.");
        creationManager.makeAnswer();
        managementManager.downVote(5678);

        accountManager.addTag("java");
        creationManager.addTags("stream-api");
        managementManager.share(1234);

        accountManager.checkContent(1234);
        managementManager.setModerationIssue(5678);
        accountManager.deleteQuestion("How to use Java Streams?");

        accountManager.checkGuidelines();
        managementManager.sendModerationNotification(123, 5678);
    }
}
