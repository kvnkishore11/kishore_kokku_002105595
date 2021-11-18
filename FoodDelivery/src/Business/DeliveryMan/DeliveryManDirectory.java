
package Business.DeliveryMan;

import java.util.ArrayList;

public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> deliveryManList = new ArrayList<>();

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public void addDeliveryMan(DeliveryMan d) {
        deliveryManList.add(d);

    }

    public void deleteDeliveryMan(DeliveryMan d) {
        deliveryManList.remove(d);
    }
}
