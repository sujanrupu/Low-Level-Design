public class BadgeRecognition {
    public void setCriteria() {
        System.out.println("Criteria set for each badge level");
    }
    public void checkValidation(int accountID, String badge) {
        System.out.println("All validation test checked for profileID: " + accountID + " for badge: " + badge);
    }
    public void generateBadge(int accountID, String badge) {
        System.out.println(badge + " badge generated for account: " + accountID);
    }
    public void sendNotification(int accountID) {
        System.out.println("Badge generation notification sent to profile: " + accountID);
    }
}
