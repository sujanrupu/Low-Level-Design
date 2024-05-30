package Account;

public interface CurrentAccount {
    public void createCurrentAccount(String name);
    public void validateCurrentDocument();
    public void setCurrentDepositLimit(int amount);
    public void setCurrentWithdrawlLimit(int amount);
    public void currentInterestRate(int rate);
}
