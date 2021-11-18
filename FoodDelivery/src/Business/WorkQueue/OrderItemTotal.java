
package Business.WorkQueue;

import Business.Restaurant.MenuItem;


public class OrderItemTotal {

    private MenuItem item;
    private int quantity;

    public MenuItem getItem() {
        return item;
    }

    public void setItem(MenuItem item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItemTotal(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

}
