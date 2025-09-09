class Transaction {
    private String transactionID;
    private double amount;
    private String type;
    private Account account;

    public Transaction(String transactionID, double amount, String type, Account account) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.type = type;
        this.account = account;
    }

    public void execute() {
        if ("deposit".equalsIgnoreCase(this.type)) {
            account.deposit(amount);
        } else if ("withdraw".equalsIgnoreCase(this.type)) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}