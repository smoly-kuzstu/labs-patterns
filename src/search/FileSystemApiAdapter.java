/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Andrey
 */
public class FileSystemApiAdapter implements ISearchAdapter{
    protected FileSystemApi fileSystem;

    public FileSystemApiAdapter(){
        this.fileSystem = new FileSystemApi("NTFS");
    }
    
    @Override
    public String searchText(String phrase){
        return this.fileSystem.justSearchText(phrase);
    }
}
