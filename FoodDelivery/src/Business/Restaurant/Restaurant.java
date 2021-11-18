
package Business.Restaurant;

import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;


public class Restaurant  extends UserAccount {

    private String name;
    private String address;
    private String phoneNumber;
    private Menu menu;

    public Restaurant(String name, String address, String phoneNumber, String username, String password, Menu menu) {
        setUsername(username);
        setPassword(password);
        setRole(new AdminRole());
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.menu = menu;
    }

    public Restaurant() {
        super();
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}