public class MeetingLeave {
    public void meetingLeave(int user) throws InterruptedException {
        System.out.println("Meeting ended, participants can leave");
        for(int i = 1; i <= user; i++) {
            System.out.println("Participant " + i + " leaved meeting");
            Thread.sleep(1000);
        }
    }
}
