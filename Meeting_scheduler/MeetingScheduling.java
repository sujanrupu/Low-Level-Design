public class MeetingScheduling {
    int time = 0, room = 0;
    public void meetingInitialization() {
        System.out.println("Meeting duration: 1 Hr.");
        System.out.println("Meeting starting time can be 1, 2,...., 13, 14, not 1:30, 12:30 etc.");
        System.out.println("Meeting date format: DD.MM.YYYY");
    }

    public void scheduleMeetingDate(String date) {
        System.out.println("Meeting scheduled on: " + date);
    }

    public void scheduleMeetingTime(int start) {
        System.out.println("Meeting schedules from " + start + " -> " + (start + 1));
        System.out.println("Meeting ID assigned: " + (time+1));
        System.out.println("Meeting room assigned: " + (room+1));
    }
}
