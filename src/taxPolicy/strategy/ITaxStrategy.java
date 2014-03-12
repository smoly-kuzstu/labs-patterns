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
    /**
     * Возвращает необходимую для уплаты сумму налога
     * @param incommingSumm Сумма доходов
     * @param expensesSumm Сумма расходов 
     */
    public double getTaxSumm(double incommingSumm, double expensesSumm);
    
    /**
     * Возвращает список документов для подачи в налоговую
     */
    public LinkedList<String> getNeededDocumentsList();
}
