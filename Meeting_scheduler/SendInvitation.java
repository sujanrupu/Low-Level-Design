public class SendInvitation {
    public void sendInvite(int users) throws InterruptedException {
        for(int i = 1; i<= users; i++) {
            System.out.println("Invitation sent to user: " + i);
            Thread.sleep(1000);
        }
        System.out.println("All invitations sent to " + users + " users");
    }
}
