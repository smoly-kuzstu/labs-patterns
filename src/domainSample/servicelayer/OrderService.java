/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainSample.servicelayer;

import domainSample.entity.BusTransportService;
import domainSample.entity.Ensuarense;
import domainSample.entity.HotelService;
import domainSample.entity.Order;
import domainSample.entity.Tourist;
import domainSample.entity.Voucher;
import domainSample.orm.EntityManager;

/**
 *
 * @author Andrey
 */
public class OrderService {
    protected EntityManager em;
    public void processorder(){
        Order order = new Order();
        Tourist tourist = new Tourist();
        
        tourist.setSurname("Иванов");
        tourist.setName("Пётр");
        tourist.setSecondName("Иванович");
        
        HotelService hotel = new HotelService();
        Ensuarense ensuarense = new Ensuarense();
        ensuarense.setTitle("Стандартная страховка");
        
        hotel.setEnsuarence(ensuarense);
        hotel.setCost(500.0);
        
        BusTransportService bus = new BusTransportService();
        hotel.setCost(500.0);
        
        order.addTourist(tourist);
        order.addHotel(hotel);
        order.addTransport(bus); 
        
        this.em.persist(order);
        this.em.flush();
    }
    
    public void createHotelVoucher(){
        
    }
}
