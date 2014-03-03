/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Andrey
 */
public class SensorMailer implements IObserver{
    @Override
    public void update(double sensorValue, String sensorName) {
        String letterText = String.format("Sensor %s was changed %f", sensorName, sensorValue);
        this.sendMail("admin@gooogle.com", letterText);
    }
    
    public void sendMail(String adress, String text){
    }
    
}
