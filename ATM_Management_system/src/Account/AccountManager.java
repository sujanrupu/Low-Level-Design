package Account;

public class AccountManager implements CurrentAccount, SavingsAccount{
    @Override
    public void validateCurrentDocument() {
        System.out.println("All document verified for current account creation");
    }

    @Override
    public void createCurrentAccount(String name) {
        System.out.println("Current account created for " + name);
    }

    @Override
    public void setCurrentDepositLimit(int amount) {
        System.out.println("Deposition limit for your current account at a time: " + amount);
    }

    @Override
    public void setCurrentWithdrawlLimit(int amount) {
        System.out.println("Withdrawal limit for your current account at a time: " + amount);
    }

    @Override
    public void currentInterestRate(int rate) {
        System.out.println("Interest rate for current account (int %) : " + rate);
    }

    @Override
    public void createSavingsAccount(String name) {
        System.out.println("Savings account created for " + name);
    }

    @Override
    public void validateSavingsDocument() {
        System.out.println("All document verified for savings account creation");
    }

    @Override
    public void setSavingsDepositLimit(int amount) {
        System.out.println("Deposition limit for your savings account at a time: " + amount);
    }

    @Override
    public void setSavingsWithdrawlLimit(int amount) {
        System.out.println("Withdrawal limit for your savings account at a time: " + amount);
    }

    @Override
    public void savingsInterestRate(int rate) {
        System.out.println("Interest rate for savings account (int %) : " + rate);
    }
}
