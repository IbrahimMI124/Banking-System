class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Successfully withdrew $" + amount + " from account " + accountNumber + ".");
        } else {
            System.out.println("Insufficient funds to withdraw $" + amount + " from account " + accountNumber + ".");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successfully deposited $" + amount + " into account " + accountNumber + ".");
    }
}
