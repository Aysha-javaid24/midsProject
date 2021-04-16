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
public class Magazine {
    private List<String> editors;
    private int monthOfPublish;
    //setter for monthOfPublish
    public void setMonth(int month)
    {
        this.monthOfPublish=month;
    }
    //getter for monthOfPublish
    public int getMonth()
    {
        return this.monthOfPublish;
    }
}
