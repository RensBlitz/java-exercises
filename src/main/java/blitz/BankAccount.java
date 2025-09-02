package blitz;

public class BankAccount {
    /**
     * A basic bank account that can handle deposits and withdrawals.
     * 
     * This class should:
     * - Maintain an accurate balance
     * - Prevent overdrafts (negative balances)
     * - Handle deposits and withdrawals safely
     * 
     * Think about: How do you validate input amounts? What should happen with invalid amounts?
     * How do you ensure the balance never goes negative?
     */
    private final String owner;
    private double balance;

    /**
     * Create a new bank account.
     * 
     * @param owner the account holder's name
     * @param openingBalance the initial deposit amount
     */
    public BankAccount(String owner, double openingBalance) {
        // TODO: Initialize the bank account
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Add money to the account.
     * 
     * @param amount the amount to deposit
     * @return true if deposit was successful, false otherwise
     */
    public boolean deposit(double amount) {
        // TODO: Implement deposit functionality
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Remove money from the account.
     * 
     * @param amount the amount to withdraw
     * @return true if withdrawal was successful, false if it would cause overdraft
     */
    public boolean withdraw(double amount) {
        // prevent overdraft
        // TODO: Implement withdrawal with overdraft protection
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public double getBalance() { return balance; }
} 