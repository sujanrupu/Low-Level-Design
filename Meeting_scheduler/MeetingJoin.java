public class MeetingJoin {
    public void meetingJoin(int user) throws InterruptedException {
        System.out.println("Meeting started, participants can join");
        for(int i = 1; i <= user; i++) {
            System.out.println("Participant " + i + " joined meeting");
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
    }
}
