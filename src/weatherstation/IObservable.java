/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;
/**
 *
 * @author Andrey
 */
public interface IObservable {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
