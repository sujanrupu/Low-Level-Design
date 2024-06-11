public class User {
    public void setName(String name) {
        System.out.println("Name set for application: " + name);
    }
    public void setContact(int contact) {
        System.out.println("Your contact no.: " + contact);
    }
    public void setMail(String email) {
        System.out.println("Email: " + email);
    }
    public void setSecurityQuestion(String question) {
        System.out.println("Recovery security question: " + question);
    }
    public void setPassword(String password) {
        System.out.println("Password set successfully");
    }
    public void createProfile(String date) {
        System.out.println("Profile created successfully on" + date);
    }

    public void loginProfile(String email, String password) {
        System.out.println("Profile logged in");
    }
}
