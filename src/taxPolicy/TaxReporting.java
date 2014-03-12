/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxPolicy;

import java.util.LinkedList;
import java.util.ListIterator;
import taxPolicy.strategy.ITaxStrategy;
import taxPolicy.strategy.SimplefedEarningsAndExpensesTaxStrategy;
import taxPolicy.strategy.SimplefedEarningsTaxStrategy;
import taxPolicy.strategy.StandartTaxStrategy;

/**
 *
 * @author Andrey
 */
public class TaxReporting {

    protected ITaxStrategy strategy;
    
    public TaxReporting(){
        this.strategy = new SimplefedEarningsTaxStrategy();
        //Can be also
        // this.strategy = new SimplefedEarningsAndExpensesTaxStrategy();
        // this.strategy = new SimplefedEarningsTaxStrategy();
        // etc.
        
    }
    
    protected void getNeededReports(){ 
        LinkedList<String> docsList = strategy.getNeededDocumentsList();
        ListIterator<String> docsIterator = docsList.listIterator();
        
        System.out.println("List of needed documents below");
        
        while(docsIterator.hasNext()){
            String docName = docsIterator.next();
            System.out.println(docName);
        }     
        //Может быть реализовано без итератора в стиле foreach
        //Вышеприведённая конструкция сделана в учбеных целях
        /*for(String docName : docsList){
            System.out.println(docName);
        }*/

    }
    
    public void putDecalaration(double incommingSumm, double expensesSumm){ 
        double taxSumm = strategy.getTaxSumm(incommingSumm, expensesSumm);
        System.out.println("Сумма к уплате " + taxSumm);
        this.getNeededReports();
    }
    
    public TaxReporting(String taxPolicyType){
        this.strategy = TaxFactory.getTaxPolicy(taxPolicyType, true);
    }
}
