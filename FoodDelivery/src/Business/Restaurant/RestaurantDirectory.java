
package Business.Restaurant;


import java.util.ArrayList;

public class RestaurantDirectory {

    ArrayList<Restaurant> restaurantList ;
    
    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public void addRestaurant(Restaurant r) {
        restaurantList.add(r);

    }

    public void deleteRestaurant(Restaurant r) {
        restaurantList.remove(r);
    }

}
