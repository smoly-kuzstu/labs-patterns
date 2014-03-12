/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */
public class SearchGoogleAdapter implements ISearchAdapter{
    protected GoogleApi googleApi;
    
    public SearchGoogleAdapter(){
        this.googleApi = new GoogleApi("8.8.8.8");
    }
    
    @Override
    public String searchText(String phrase){
        return this.googleApi.amazingSearch(phrase);
    }
}
