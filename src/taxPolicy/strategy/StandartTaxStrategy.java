/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy.strategy;

import java.util.LinkedList;

/**
 *
 * @author Andrey
 * Основная система налогообложения
 */
public class StandartTaxStrategy implements ITaxStrategy{
    
    @Override
    public double getTaxSumm(double incommingSumm, double expensesSumm){
        // Состоит из НДФЛ, может быть реализация возврата НДС
        return incommingSumm  * 0.13; 
    }
    
    @Override
    public LinkedList<String> getNeededDocumentsList(){
        LinkedList<String> docsList =  new LinkedList<>();
        docsList.add("Налоговая декларация");
        docsList.add("Книга доходов и расходов");
        docsList.add("Отчёт о возмещении НДС");
        return docsList;
    }
    
}
