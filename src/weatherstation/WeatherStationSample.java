/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Andrey
 */
public class WeatherStationSample {
    public WeatherStationSample(){
        WeatherStation weaterStation = new WeatherStation();
        MailerReport mailerRep = new MailerReport();
        
        SensorTemperature tempSensor = new SensorTemperature();
        tempSensor.registerObserver(weaterStation);
        tempSensor.registerObserver(mailerRep);
        
        SensorHumidity humSensor = new SensorHumidity();
        humSensor.registerObserver(weaterStation);
        humSensor.registerObserver(mailerRep);
    }
}
