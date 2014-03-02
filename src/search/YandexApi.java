/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */

public class YandexApi{
    
    protected int maxThreads;
    
    public YandexApi(int maxThreads){
        this.maxThreads = maxThreads;
    }
    
    public String findText(String phrase){
        return "Поиск текста через Яндекс!";
    }
}

