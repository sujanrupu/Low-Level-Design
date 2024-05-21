import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        MeetingScheduling ms = new MeetingScheduling();
        SendInvitation si = new SendInvitation();
        UserInvitationManagement ui = new UserInvitationManagement();
        MeetingJoin mj = new MeetingJoin();
        MeetingLeave ml = new MeetingLeave();


        ms.meetingInitialization();
        String date = sc.nextLine();
        ms.scheduleMeetingDate(date);
        int startTime = sc.nextInt();
        ms.scheduleMeetingTime(startTime);

        int participants = sc.nextInt();
        si.sendInvite(participants);

        participants = ui.countParticipants(participants, date);

        mj.meetingJoin(participants);
        ml.meetingLeave(participants);

        Thread.sleep(2000);
        System.out.println("All participants leaved, Thank You");
    }
}