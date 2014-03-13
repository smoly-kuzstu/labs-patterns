/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Andrey
 */
public class SensorTemperature extends Sensor{

    protected final double  minTemperature = -35.0;
    protected final double  maxTemperature = 50.0;
    
    @Override
    protected double countValueByVoltage(double voltage) {
        //Длина диапазона температур
        double scaleLength = (maxTemperature - minTemperature);
        return minTemperature + (voltage / maxVoltage) * scaleLength;
    }
    
}
