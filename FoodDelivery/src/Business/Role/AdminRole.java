
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import ui.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Restaurant restaurant, Customer customer) {
        return new AdminWorkAreaJPanel(userProcessContainer, business, account, restaurant);
    }


}


