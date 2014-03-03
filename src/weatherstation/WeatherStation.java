/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andrey
 */
public class WeatherStation implements IObserver{

    protected HashMap<String, Double> sensorStatements;
    
    public WeatherStation(){
        this.sensorStatements = new HashMap<>();
    }
    
    public void display(){
        for (Map.Entry<String, Double> entry : sensorStatements.entrySet()) {
            String sensorName = entry.getKey();
            Double value = entry.getValue();
            System.out.printf("Sensor %s value is f%", sensorName,  value);
            System.out.println();
        }
    }
    
    @Override
    public void update(double sensorValue, String sensorName) {
        sensorStatements.put(sensorName, sensorValue);
        this.display();
    }
    
}
