/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy.strategy;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public interface ITaxStrategy {
    public double getTaxSumm(double incommingSumm, double expensesSumm);
    public LinkedList<String> getNeededDocumentsList();
}
