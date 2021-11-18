
package Business.Customer;

import Business.UserAccount.UserAccount;

public class Customer extends UserAccount {
    
    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber, String email, String username, String password) {
        setUsername(username);
        setPassword(password);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer(String name) {
        this.name = name;
    }
}
