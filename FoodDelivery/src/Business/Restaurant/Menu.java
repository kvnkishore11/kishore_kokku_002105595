
package Business.Restaurant;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> menuList;

    public Menu() {
        menuList = new ArrayList<MenuItem>();
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public void addMenuItem(MenuItem mi) {
        menuList.add(mi);
    }

    public void deleteMenuItem(MenuItem mi) {
        menuList.remove(mi);
    }

}
