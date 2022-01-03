import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        for (Customer c:
             customers) {
            if (c.getName().equals(customerName)) {
                return c;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double transaction) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, transaction));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        if (findCustomer(name) != null) {
            findCustomer(name).addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }
}
