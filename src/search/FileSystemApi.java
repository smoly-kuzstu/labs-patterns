/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */
public class FileSystemApi {
    protected String fileSystem;
    
    public FileSystemApi(String fileSystem){
        this.fileSystem = fileSystem;
    }
    
    public String justSearchText(String phrase){
        return "Search in local file System";
    }
}
