
package Business.Restaurant;


public class MenuItem {

    private String ItemName;
    private Double ItemPrice;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public Double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(Double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public MenuItem(String ItemName, Double ItemPrice) {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
    }

    @Override
    public String toString() {
        return ItemName;
    }

}
