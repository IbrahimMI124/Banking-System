public class Main {
    public static void main(String[] args) {
        
        // 1. Create a Bank instance
        Bank nationalBank = new Bank("National Bank", "123 Capital Street");
        
        // 2. Create multiple Customer instances (N=2) to show 1:N relationship
        Customer alice = new Customer("Alice Johnson");
        Customer bob = new Customer("Bob Smith");
        
        // 3. Add customers to the bank
        nationalBank.addCustomer(alice);
        nationalBank.addCustomer(bob);
        System.out.println();
        
        // 4. Each customer opens multiple accounts (N=2)
        Account aliceChecking = new Account("AC-001", 1000.00);
        Account aliceSavings = new Account("AS-002", 5000.00);
        alice.openAccount(aliceChecking);
        alice.openAccount(aliceSavings);
        System.out.println();
        
        Account bobChecking = new Account("BC-003", 200.00);
        Account bobSavings = new Account("BS-004", 1500.00);
        bob.openAccount(bobChecking);
        bob.openAccount(bobSavings);
        System.out.println();

        // 5. Perform transactions (calling methods indirectly via the Transaction class)
        
        // Deposit into Alice's checking account
        Transaction depositTx1 = new Transaction("T-001", 300.00, "deposit", aliceChecking);
        depositTx1.execute();
        System.out.println("Current balance for Alice's Checking Account: $" + aliceChecking.getBalance() + "\n");
        
        // Withdraw from Bob's checking account
        Transaction withdrawTx1 = new Transaction("T-002", 250.00, "withdraw", bobChecking);
        withdrawTx1.execute();
        System.out.println("Current balance for Bob's Checking Account: $" + bobChecking.getBalance() + "\n");
        
        // Attempt a transaction that will fail due to insufficient funds
        Transaction failTx = new Transaction("T-003", 2000.00, "withdraw", aliceChecking);
        failTx.execute();
        System.out.println("Current balance for Alice's Checking Account: $" + aliceChecking.getBalance() + "\n");
        
        // 6. Call remaining methods
        
        // Alice closes one of her accounts
        alice.closeAccount(aliceSavings);
        System.out.println();
        
        // The bank removes a customer
        nationalBank.removeCustomer(bob);
        
    }
}