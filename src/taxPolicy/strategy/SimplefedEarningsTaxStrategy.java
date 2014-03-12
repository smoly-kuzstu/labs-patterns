/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy.strategy;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 * Упрощенная система налогообложения - объект налогообложения - доходы 
 */
public class SimplefedEarningsTaxStrategy implements ITaxStrategy{
    
    @Override
    public double getTaxSumm(double incommingSumm, double expensesSumm){
        return incommingSumm  * 0.06; 
    }
    
    @Override
    public LinkedList<String> getNeededDocumentsList(){
        LinkedList<String> docsList =  new LinkedList<>();
        docsList.add("Налоговая декларация");
        return docsList;
    }
}
