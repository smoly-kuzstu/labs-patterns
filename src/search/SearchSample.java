/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */
public class SearchSample {
    public void SearchSample(){
        
        System.out.println("Enter text for search");
        String phrase = System.console().readLine();
        
        System.out.println("Choose search system[Google, Yandex, FileSystem]");
        String searchType = System.console().readLine();
        
        ISearchAdapter searchAdapter;
        
        switch (searchType.toLowerCase()){
            case "google":
                searchAdapter = new SearchGoogleAdapter();
                break;
            case "yandex":
                searchAdapter = new SearchYandexAdapter();    
            default:
                searchAdapter = new FileSystemApiAdapter();
        }
        
        String resultStr = searchAdapter.searchText(phrase);
        System.out.println(resultStr); 
    }
}
