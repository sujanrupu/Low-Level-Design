package Account;

public interface SavingsAccount {
    public void createSavingsAccount(String name);
    public void validateSavingsDocument();
    public void setSavingsDepositLimit(int amount);
    public void setSavingsWithdrawlLimit(int amount);
    public void savingsInterestRate(int rate);
}
