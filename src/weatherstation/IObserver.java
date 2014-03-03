/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Andrey
 */
public interface IObserver {
    public void update(double sensorValue, String sensorName);
}
