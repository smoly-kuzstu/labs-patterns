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
public class StandartTaxStrategy implements ITaxStrategy{
    
    public double getTaxSumm(double incommingSumm, double expensesSumm){
        return incommingSumm  * 0.13; 
    }
    
    public LinkedList<String> getNeededDocumentsList(){
        LinkedList<String> docsList =  new LinkedList<>();
        docsList.add("Налоговая декларация");
        docsList.add("Книга доходов и расходов");
        docsList.add("Отчёт о возмещении НДС");
        return docsList;
    }
    
}
