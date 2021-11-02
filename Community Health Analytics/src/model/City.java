
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KishoreKVN
 */
public class City {
    
    private String name;
    private int id;
    private List<Community> communities;
    
    private static int cityCounter = 0;

    public City(String name, int id) {
        this.name = name;
        this.id = id;
        this.communities = new ArrayList<>();
    }
    
    
    public City(String name){
        this.name = name;
        this.communities = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
    
    public void addCommunity(Community c){
        communities.add(c);
    }
    
    public void removeCommunity(Community c){
        communities.remove(c);
    }
    
    
}
