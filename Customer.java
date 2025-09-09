import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " opened for customer " + this.name + " with balance $"+account.getBalance());
    }

    public void closeAccount(Account account) {
        if (accounts.remove(account)) {
            System.out.println("Account " + account.getAccountNumber() + " has been closed for customer " + this.name + ".");
        } else {
            System.out.println("Account " + account.getAccountNumber() + " was not found for customer " + this.name + ".");
        }
    }
}