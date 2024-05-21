import java.util.Scanner;

public class UserInvitationManagement implements AcceptInvitation, RejectInvitation {
    boolean isAccepted(int n) {
        if(n == 1)  return true;
        else return false;
    }

    @Override
    public void acceptInvitation() {
        System.out.println("Invitation confirmed");
    }

    @Override
    public void rejectInvitation() {
        System.out.println("Invitation rejected");
    }

    Scanner sc = new Scanner(System.in);
    public int countParticipants(int users, String date) throws InterruptedException {
        int participant = users;
        System.out.println("Press 1 for accept and 0 for rejection for meeting on " + date);
        for(int i = 1; i <= users; i++) {
            System.out.println("Participant " + i + ": ");
            int n = sc.nextInt();
            boolean ans = isAccepted(n);
            if(!ans)  {
                rejectInvitation();
                participant--;
            }
            else {
                acceptInvitation();
                System.out.println("Meeting scheduled on calender date: " + date);
            }
            Thread.sleep(1000);
        }
        System.out.println("Confirmed participants: " + participant);
        return participant;
    }
}
