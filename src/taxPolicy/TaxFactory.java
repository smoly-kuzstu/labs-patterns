/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy;

import taxPolicy.strategy.ITaxStrategy;
import taxPolicy.strategy.SimplefedEarningsAndExpensesTaxStrategy;
import taxPolicy.strategy.SimplefedEarningsTaxStrategy;
import taxPolicy.strategy.StandartTaxStrategy;

/**
 *
 * @author Andrey
 */
public class TaxFactory {
    /**
     * Возвращает стратегию для расчёта налогов и подачи отчётности
     * @param policyType Название системы налогообложения
     * @param isSimple Является ли система налогообложения упрощённой
     */
    public static ITaxStrategy getTaxPolicy(String policyType, boolean isSimple){
        switch (policyType){
            case "Стандартная":
                return new StandartTaxStrategy();   
            case "Доходы и расходы" :
                return new SimplefedEarningsAndExpensesTaxStrategy();  
            case "Доходы" :
                return new SimplefedEarningsTaxStrategy();      
            default:
                return new StandartTaxStrategy();   
        }  
    }
}
