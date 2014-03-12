/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy.strategy;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 * Упрощенная система налогообложения - объект налогообложения доходы минус расходы
 */
public class SimplefedEarningsAndExpensesTaxStrategy  implements ITaxStrategy{
    
    @Override
    public double getTaxSumm(double incommingSumm, double expensesSumm){
        return (incommingSumm -  expensesSumm) * 0.15; 
    }
    
    @Override
    public LinkedList<String> getNeededDocumentsList(){
        LinkedList<String> docsList =  new LinkedList<>();
        docsList.add("Налоговая декларация");
        docsList.add("Книга доходов и расходов");
        return docsList;
    }
    
}
