import Task.TaskManager;

public class Main {
    public static void main(String[] args) {
        // Creating instances of classes
        User user = new User();
        TaskTransfer taskTransfer = new TaskTransfer();
        TaskFilter taskFilter = new TaskFilter();
        Notification notification = new Notification();
        Admin admin = new Admin();
        TaskManager taskManager = new TaskManager();

        // Using methods from User class
        user.setName("John");
        user.setContact(1234567890);
        user.setMail("john@example.com");
        user.setSecurityQuestion("What is your pet's name?");
        user.setPassword("password123");
        user.createProfile("2024-06-12");
        user.loginProfile("john@example.com", "password123");

        // Using methods from TaskTransfer class
        taskTransfer.sendTask(1001, 2001);
        taskTransfer.receiveTask(1001, 3001);
        taskTransfer.sendNotification();

        // Using methods from TaskFilter class
        taskFilter.setFilter("Priority");
        taskFilter.extractTask(1001, 2);

        // Using methods from Notification class
        notification.generate(1001, "2024-06-12", 2001);
        notification.setContent("Task deadline approaching");
        notification.validateAccess(3001);
        notification.repeat(3);

        // Using methods from Admin class
        admin.syncModule();
        admin.manageServices();
        admin.manageGuidelines(4001);
        admin.manageProfile(5001);

        // Using methods from TaskManager class
        taskManager.setId(1001);
        taskManager.setPriority(1001, 2);
        taskManager.setDeadline("2024-06-20");
        taskManager.checkCompletionStatus(1001);
        taskManager.checkDeadline(1001, "2024-06-20");
        taskManager.extraTime(24);
        taskManager.completionPercent(1001, 50);
        taskManager.estimatedTime(48);
        taskManager.sendNotification();
    }
}
