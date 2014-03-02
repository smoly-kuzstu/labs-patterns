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
    public static ITaxStrategy getTaxPolicy(String PolicyType, boolean isSimple){
        ITaxStrategy strategy;
        switch (PolicyType){
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
