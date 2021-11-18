
package Business.Customer;

import java.util.ArrayList;

public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer c) {
        customerList.add(c);

    }

    public void deleteCustomer(Customer c) {
        customerList.remove(c);
    }

    public Customer createCustomer(String name) {
        Customer customer = new Customer(name);
        if (!customerList.contains(customer)) {
            System.out.println("adding ------ customer" + name);
            customerList.add(customer);
        }
        System.out.println("using existing ------ customer" + name);
        return customer;
    }
}
