/**
 * BankAccount class demonstrating encapsulation principles
 */
public class BankAccount {
    // Private fields - data hiding
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private boolean isActive;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, 
                      String accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
        this.isActive = true;
    }
    
    // Getter methods - controlled access to private data
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    // Controlled setter methods with validation
    public void setAccountHolderName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.accountHolderName = name.trim();
        } else {
            System.out.println("Invalid name. Name cannot be empty.");
        }
    }
    
    // Deposit method with validation
    public boolean deposit(double amount) {
        if (!isActive) {
            System.out.println("Cannot deposit. Account is inactive.");
            return false;
        }
        
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + String.format("%.2f", amount) + 
                             ". New balance: $" + String.format("%.2f", balance));
            return true;
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
            return false;
        }
    }
    
    // Withdraw method with validation
    public boolean withdraw(double amount) {
        if (!isActive) {
            System.out.println("Cannot withdraw. Account is inactive.");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Insufficient funds. Available balance: $" + 
                             String.format("%.2f", balance));
            return false;
        }
        
        balance -= amount;
        System.out.println("Withdrew $" + String.format("%.2f", amount) + 
                         ". New balance: $" + String.format("%.2f", balance));
        return true;
    }
    
    // Transfer method
    public boolean transferTo(BankAccount targetAccount, double amount) {
        if (this.withdraw(amount)) {
            if (targetAccount.deposit(amount)) {
                System.out.println("Transfer successful to account: " + 
                                 targetAccount.getAccountNumber());
                return true;
            } else {
                // Refund if deposit fails
                this.deposit(amount);
                System.out.println("Transfer failed. Amount refunded.");
                return false;
            }
        }
        return false;
    }
    
    // Account management methods
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Account " + accountNumber + " has been deactivated.");
    }
    
    public void activateAccount() {
        isActive = true;
        System.out.println("Account " + accountNumber + " has been activated.");
    }
    
    // Private helper method - internal use only
    private double calculateInterest(double rate) {
        return balance * rate / 100;
    }
    
    // Public method that uses private helper
    public void addInterest(double rate) {
        if (!isActive) {
            System.out.println("Cannot add interest. Account is inactive.");
            return;
        }
        
        if (rate > 0) {
            double interest = calculateInterest(rate);
            balance += interest;
            System.out.println("Interest added: $" + String.format("%.2f", interest) + 
                             " at " + rate + "% rate. New balance: $" + 
                             String.format("%.2f", balance));
        }
    }
    
    // Display account information
    public void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println();
    }
    
    @Override
    public String toString() {
        return "BankAccount{" +
               "accountNumber='" + accountNumber + '\'' +
               ", accountHolderName='" + accountHolderName + '\'' +
               ", balance=" + balance +
               ", accountType='" + accountType + '\'' +
               ", isActive=" + isActive +
               '}';
    }
}