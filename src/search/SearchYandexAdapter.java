/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */
public class SearchYandexAdapter implements ISearchAdapter{
    protected YandexApi api;
    
    public SearchYandexAdapter(){
        this.api = new YandexApi(5);
    }
    
    public String searchText(String phrase){
        return this.api.findText(phrase);
    }
}
