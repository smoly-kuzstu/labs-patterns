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
public class SimplefedEarningsTaxStrategy implements ITaxStrategy{
    
    public double getTaxSumm(double incommingSumm, double expensesSumm){
        return incommingSumm  * 0.06; 
    }
    
    public LinkedList<String> getNeededDocumentsList(){
        LinkedList<String> docsList =  new LinkedList<>();
        docsList.add("Налоговая декларация");
        return docsList;
    }
}
