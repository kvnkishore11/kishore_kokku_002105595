
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DeliveryManRole.DeliveryManWorkAreaJPanel;


public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, Restaurant restaurant, Customer customer) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer, account, business);
    }
    
}
