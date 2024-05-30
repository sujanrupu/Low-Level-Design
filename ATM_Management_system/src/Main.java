import Account.AccountManager;
import AccountAccess.AccessManager;
import ATMComponents.ATMManager;
import SystemInteraction.InteractionManager;

public class Main {
    public static void main(String[] args) {
        // Creating objects of various managers
        AccountManager accountManager = new AccountManager();
        AccessManager accessManager = new AccessManager();
        ATMManager atmManager = new ATMManager();
        InteractionManager interactionManager = new InteractionManager();
        Session session = new Session();

        // Using methods from AccountManager
        accountManager.createCurrentAccount("John Doe");
        accountManager.createSavingsAccount("Jane Smith");
        accountManager.validateCurrentDocument();
        accountManager.validateSavingsDocument();
        accountManager.setCurrentDepositLimit(5000);
        accountManager.setSavingsDepositLimit(10000);
        accountManager.setCurrentWithdrawlLimit(2000);
        accountManager.setSavingsWithdrawlLimit(5000);
        accountManager.currentInterestRate(5);
        accountManager.savingsInterestRate(7);

        // Using methods from AccessManager
        accessManager.authenticateUserData();
        accessManager.authenticateUserActivity();
        accessManager.validateTrasioctionActivity();
        accessManager.checkServerUpdation();

        // Using methods from ATMManager
        atmManager.insertCard(123456789);
        atmManager.showHolderName("John Doe");
        atmManager.screenDiameter(1920, 1080);
        atmManager.screenDisplay(1080);
        atmManager.insertAmount(1000);
        atmManager.ValidateKeyOperation();
        atmManager.checkKeyActivity();
        atmManager.searchAmount(2000);
        atmManager.validateAmount(2000);
        atmManager.setPrintAmount(2000);
        atmManager.printReceipt();
        atmManager.updateInformation();

        // Using methods from InteractionManager
        interactionManager.checkBalance();
        interactionManager.validateInfo();
        interactionManager.showBalance(50000);
        interactionManager.checkWithDrawl(2000);
        interactionManager.updateWithDrawl(2000);
        interactionManager.receiverId(987654321);
        interactionManager.validateReceiverId();
        interactionManager.setSendingAmount(3000);
        interactionManager.sendConfirmation();

        // Using methods from Session
        session.setSessionTime(30);
        session.expireSession();
        session.renewSession();
    }
}
