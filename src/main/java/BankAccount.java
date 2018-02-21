import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Workplace account.
         */
        WORKPLACE
    }

    /**
     * The account number of an account.
     */
    private int accountNumber;
    /**
     * The type of account.
     */
    private BankAccountType accountType;
    /**
     * The balance of the account.
     */
    private double accountBalance;
    /**
     * The owner of the account.
     */
    private String ownerName;
    /**
     * The interest rate for the account.
     */
    private double interestRate;
    /**
     * The amount of interest earned by the account.
     */
    private double interestEarned;

    /**
     * Creates a bank account object.
     * @param name Owner of the account.
     * @param accountCategory Type of account to open.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.incrementAccounts();

    }

    /**
     * Sets the bank account number.
     * @param num The number to set.
     */
    public void setAccountNumber(final int num) {
        this.accountNumber = num;
    }

    /**
     * Returns the bank account number.
     * @return The number to return.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets the bank account balance.
     * @param setAccount Balance to set.
     */
    public void setAccountBalance(final double setAccount) {
        this.accountBalance = setAccount;
    }

    /**
     * Returns the current account balance.
     * @return The balance to return.
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Sets the name of the account owner.
     * @param owner Name to set.
     */
    public void setOwnerName(final String owner) {
        this.ownerName = owner;
    }

    /**
     * Returns the name of the account owner.
     * @return The name of the owner.
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * Sets the interest earned by the account.
     * @param interest The amount earned.
     */
    public void setInterestEarned(final double interest) {
        this.interestEarned = interest;
    }

    /**
     * Returns the amount of interest earned.
     * @return The amount of interest earned.
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }

    /**
     * Sets the type of bank account.
     * @param type The type of account to be set.
     */
    public void setAccountType(final BankAccountType type) {
        this.accountType = type;
    }

    /**
     * Returns the type of the account.
     * @return The type to be returned.
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }

    /**
     * Sets the account interest rate.
     * @param interestrate Returns the interest rate.
     */
    public void setInterestRate(final double interestrate) {
        this.interestRate = interestrate;
    }

    /**
     * Returns the account interest rate.
     * @return The interest rate to return.
     */
    public double getInterestRate() {
        return this.interestRate;
    }
}