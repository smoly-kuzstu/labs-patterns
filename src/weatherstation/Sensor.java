/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public abstract class Sensor implements IObservable{
    protected LinkedList<IObserver> observers;
    protected double sensorValue;
    protected String sensorName;

    @Override
    public void registerObserver(IObserver o)
    {
        observers.add(o);
    }
 
    @Override
    public void removeObserver(IObserver o)
    {
        observers.remove(o);
    }
 
    @Override
    public void notifyObservers()
    {
        for (IObserver observer : observers)
        {
            observer.update(this.sensorValue, this.sensorName);
        }
    }
    
}
