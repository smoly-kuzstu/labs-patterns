/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainSample.entity;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public class Order {
    protected LinkedList<Service> servicesList;
    protected LinkedList<Tourist> touristsList;
    protected int id;
    
    public void addTourist(Tourist tourist){
        touristsList.add(tourist);
    }
    
    public LinkedList<Tourist> getTourists(){
        return touristsList;
    }
    
    public double getTotalCost(){
        double totalSumm = 0;
        
        for(Service service : servicesList){
            totalSumm += service.getCost();
        }
        
        return totalSumm;
    }
    
    public void addTransport(TransportService transport){
        servicesList.add(transport);
    }
    
    public void addHotel(HotelService transport){
        servicesList.add(transport);
    }
    
    public LinkedList<Service> getServices(){
        return servicesList;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
