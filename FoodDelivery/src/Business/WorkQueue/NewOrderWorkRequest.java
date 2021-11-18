
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

public class NewOrderWorkRequest extends WorkRequest {

    private int orderId;
    private static int count = 1;
    private List<OrderItemTotal> orderTotal = new ArrayList<OrderItemTotal>();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        this.orderId = orderId;
        count++;
    }

    public List<OrderItemTotal> getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(List<OrderItemTotal> orderTotal) {
        this.orderTotal = orderTotal;
    }

    public OrderItemTotal addItem(OrderItemTotal orderItemTotal) {
        orderTotal.add(orderItemTotal);
        return orderItemTotal;
    }

}
