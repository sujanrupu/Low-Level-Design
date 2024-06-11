public class Admin extends User{
    public void syncModule() {
        System.out.println("All modules synchronized properly");
    }
    public void manageServices() {
        System.out.println("All services working properly");
    }
    public void manageGuidelines(int postId) {
        System.out.println("Post ID: " + postId + " deleted for violating guidelines");
    }
    public void manageProfile(int userId) {
        System.out.println("Access to account ID: " + userId + " restricted for violating guidelines");
    }
}
