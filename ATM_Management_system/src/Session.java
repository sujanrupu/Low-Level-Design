public class Session {
    public void setSessionTime(int time) {
        System.out.println("Session validation for each session is: " + time);
    }
    public void expireSession() {
        System.out.println("The session has been expired");
    }
    public void renewSession() {
        System.out.println("New session re-initiated");
    }
}
