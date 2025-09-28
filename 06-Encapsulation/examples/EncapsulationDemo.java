/**
 * Demonstration of encapsulation concepts
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation Demo ===\n");
        
        // Create bank accounts
        BankAccount account1 = new BankAccount("ACC001", "John Doe", "Savings", 1000.0);
        BankAccount account2 = new BankAccount("ACC002", "Jane Smith", "Checking", 500.0);
        
        System.out.println("1. Initial Account Information:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        // Demonstrate encapsulation - cannot directly access private fields
        // account1.balance = 5000; // This would cause compilation error
        // System.out.println(account1.accountNumber); // This would cause compilation error
        
        // Must use public methods to access and modify data
        System.out.println("2. Accessing data through getter methods:");
        System.out.println("Account 1 holder: " + account1.getAccountHolderName());
        System.out.println("Account 1 balance: $" + String.format("%.2f", account1.getBalance()));
        System.out.println("Account 2 holder: " + account2.getAccountHolderName());
        System.out.println("Account 2 balance: $" + String.format("%.2f", account2.getBalance()));
        System.out.println();
        
        // Demonstrate controlled access through methods
        System.out.println("3. Deposit operations:");
        account1.deposit(200.0);  // Valid deposit
        account1.deposit(-50.0);  // Invalid deposit - will be rejected
        account1.deposit(0);      // Invalid deposit - will be rejected
        System.out.println();
        
        System.out.println("4. Withdrawal operations:");
        account2.withdraw(100.0);  // Valid withdrawal
        account2.withdraw(1000.0); // Invalid - insufficient funds
        account2.withdraw(-20.0);  // Invalid - negative amount
        System.out.println();
        
        System.out.println("5. Transfer operations:");
        account1.transferTo(account2, 300.0); // Valid transfer
        account1.transferTo(account2, 2000.0); // Invalid - insufficient funds
        System.out.println();
        
        // Show updated balances
        System.out.println("6. Updated Account Information:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        // Demonstrate data validation in setter
        System.out.println("7. Testing setter validation:");
        account1.setAccountHolderName("John William Doe"); // Valid
        account1.setAccountHolderName("");  // Invalid - empty name
        account1.setAccountHolderName(null); // Invalid - null name
        System.out.println("Updated name: " + account1.getAccountHolderName());
        System.out.println();
        
        // Demonstrate account activation/deactivation
        System.out.println("8. Account status management:");
        System.out.println("Account 2 is active: " + account2.isActive());
        account2.deactivateAccount();
        System.out.println("Account 2 is active: " + account2.isActive());
        
        // Try operations on inactive account
        account2.deposit(100.0);   // Should be rejected
        account2.withdraw(50.0);   // Should be rejected
        account2.addInterest(2.5); // Should be rejected
        
        // Reactivate account
        account2.activateAccount();
        account2.deposit(100.0);   // Now should work
        System.out.println();
        
        // Demonstrate interest calculation (uses private method internally)
        System.out.println("9. Interest calculation:");
        account1.addInterest(2.5); // 2.5% interest
        account2.addInterest(1.8); // 1.8% interest
        System.out.println();
        
        // Final account information
        System.out.println("10. Final Account Information:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        
        // Demonstrate toString method
        System.out.println("11. Using toString() method:");
        System.out.println(account1);
        System.out.println(account2);
        
        // Demonstrate benefits of encapsulation
        System.out.println("\n=== Benefits of Encapsulation Demonstrated ===");
        System.out.println("✓ Data hiding: Private fields cannot be accessed directly");
        System.out.println("✓ Controlled access: Only through public methods");
        System.out.println("✓ Data validation: Invalid operations are prevented");
        System.out.println("✓ Maintainability: Internal implementation can change");
        System.out.println("✓ Security: Business rules are enforced");
    }
}