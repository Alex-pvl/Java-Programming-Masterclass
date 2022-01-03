import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String branchName) {
        for (Branch b:
             branches) {
            if (b.getName().equals(branchName)) {
                return b;
            }
        }
        return null;
    }

    public boolean addBranch(String branch) {
        if (findBranch(branch) == null) {
            branches.add(new Branch(branch));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).newCustomer(customerName, transaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        } else {
            return false;
        }
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        if(findBranch(nameOfBranch) != null && printTransactions) {
            System.out.println("Customer details for branch " + findBranch(nameOfBranch).getName());
            for(int i = 0; i < findBranch(nameOfBranch).getCustomers().size(); i++) {
                System.out.println("Customer: " + findBranch(nameOfBranch).getCustomers().get(i).getName() + "[" + (i+1) + "]");
                System.out.println("Transactions");
                for(int j = 0; j < findBranch(nameOfBranch).getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + findBranch(nameOfBranch).getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        } else if(findBranch(nameOfBranch) != null) {
            System.out.println("Customer details for branch " + findBranch(nameOfBranch).getName());
            for(int i = 0; i < findBranch(nameOfBranch).getCustomers().size(); i++) {
                System.out.println("Customer: " + findBranch(nameOfBranch).getCustomers().get(i).getName() + "[" + (i+1) + "]");
            }
            return true;
        } else {
            return false;
        }
    }

}
