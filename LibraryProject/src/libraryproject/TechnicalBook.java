/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
package libraryproject;

/**
 *
 * @author aysha
 */
public class TechnicalBook {
    private List<String> authors;
    private String edition;
    //setter for edition
    public void setEdition(String edition)
    {
        this.edition=edition;
    }
    //getter for edition
    public String getEdition()
    {
        return this.edition;
    }
}
