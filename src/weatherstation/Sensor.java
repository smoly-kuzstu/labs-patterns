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
    
    protected final double maxVoltage = 5.0;

    /**
     * Данный метод запускается при возникновении аппаратного прерывания,
     * То есть при изменений.
     * @param voltage Текущее напряжение на выходе датчика
     */
    public void hardwareIterrupt(double voltage){
        this.sensorValue = this.countValueByVoltage(voltage);
        this.notifyObservers();
    }
    
    protected abstract double countValueByVoltage(double voltage);
    
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
