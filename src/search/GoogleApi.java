/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */
public class GoogleApi {
    
    protected String dnsHost;
    
    public GoogleApi(String dnsHost){
        this.dnsHost = dnsHost;
    }
    
    public String amazingSearch(String phrase){
        return "Search some text in gogole. So much results!";
    }
}
