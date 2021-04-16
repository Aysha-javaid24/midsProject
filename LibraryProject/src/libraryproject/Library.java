/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

/**
 *
 * @author aysha
 */
import java.util.List;
import java.util.ArrayList;
public class Library {
    private static Library instance;
    private List<Magazine> magazines;
    private List<TechnicalBook> technicalBook;
    private Library()
    {
        magazines=new ArrayList<Magazine>();
    }
    public static Library getInstance()
    {
        if(instance==null)
        {
            instance=new Library();
        }
        return instance;
    }
    public void addMagazine(Magazine m){
        magazines.add(m);
    }   
    public void addtBook(TechnicalBook t){
        technicalBook.add(t);
    }    
}
