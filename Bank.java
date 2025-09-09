import java.util.ArrayList;

class Bank {
    private String name;
    private String address;
    private ArrayList<Customer> customers;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " has been added to the bank.");
    }

    public void removeCustomer(Customer customer) {
        if (customers.remove(customer)) {
            System.out.println("Customer " + customer.getName() + " has been removed from the bank.");
        } else {
            System.out.println("Customer " + customer.getName() + " was not found in the bank.");
        }
    }
}

