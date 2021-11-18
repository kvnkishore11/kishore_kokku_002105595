
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;


public class DeliveryMan extends UserAccount {

    private String name;
    private String address;
    private String phoneNumber;

    public DeliveryMan(String name, String address, String phoneNumber, String username, String password) {
        setUsername(username);
        setPassword(password);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}