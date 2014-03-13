/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Andrey
 */
public class SensorHumidity  extends Sensor{
    protected final double  minHumidity = 0;
    protected final double  maxHumidity = 100.0;
    
    @Override
    protected double countValueByVoltage(double voltage) {
        //Длина диапазона температур
        double scaleLength = (maxHumidity - minHumidity);
        return minHumidity + (voltage / maxVoltage) * scaleLength;
    }
}
