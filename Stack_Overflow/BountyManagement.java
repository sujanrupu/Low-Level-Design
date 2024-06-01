public class BountyManagement {
    public void setBountyCriteria() {
        System.out.println("Bounty allocation criteria and guidelines set");
    }
    public void setLimit(int contentId, int amount) {
        System.out.println("Bounty of amount : " + amount + " set for the content: " + contentId);
    }
    public void allocateBounty(int accountId, int amount) {
        System.out.println("Bounty of amount : " + amount + " allocated to account: " + accountId);
    }
}
