
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, Restaurant restaurant, Customer customer) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
