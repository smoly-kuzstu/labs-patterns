/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy;

import taxPolicy.strategy.ITaxStrategy;
import java.util.HashMap;
/**
 *
 * @author Andrey
 */
public class FlyweightTaxFactory {
    protected static HashMap<String, ITaxStrategy> strategies;
            
    public static ITaxStrategy getTaxPolicy(String PolicyType, boolean isSimple){
         ITaxStrategy strategy;
         String strategyKey = PolicyType + "_" + Boolean.toString(isSimple);
         
         if (strategies.containsKey(strategyKey)){
             return strategies.get(strategyKey);
         } else{
             strategy = TaxFactory.getTaxPolicy(PolicyType, isSimple);
             strategies.put(strategyKey, strategy);
             return strategy;
         }
    }
}
