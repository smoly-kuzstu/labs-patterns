/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 */
public class SimplefedEarningsAndExpensesTaxStrategy  implements ITaxStrategy{
    
    public double getTaxSumm(double incommingSumm, double expensesSumm){
        return (incommingSumm -  expensesSumm) * 0.15; 
    }
    
    public LinkedList<String> getNeededDocumentsList(){
        LinkedList<String> docsList =  new LinkedList<>();
        return docsList;
    }
    
}
