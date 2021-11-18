
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import ui.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

public class CustomerRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Restaurant restaurant, Customer customer) {
        return new CustomerAreaJPanel(userProcessContainer, account, business, customer);
    }
    
    
}
