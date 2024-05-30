package AccountAccess;

public class AccessManager implements UserAuthentication, TransioctionValidation{
    @Override
    public void validateTrasioctionActivity() {
        System.out.println("Transioction activity validated and completed successfully");
    }

    @Override
    public void checkServerUpdation() {
        System.out.println("Activity synchronized and updated in server");
    }

    @Override
    public void authenticateUserData() {
        System.out.println("User data validated");
    }

    @Override
    public void authenticateUserActivity() {
        System.out.println("user acitivity has been authenticated from bank server");
    }
}
