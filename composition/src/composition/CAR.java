/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author aysha
 */
public class CAR {
    private String color;
    private int noTyres;
    private engine eng;
    public CAR(String colr, int ntyres, String type, String name, String pwr)
    {
        this.eng=new engine();
        eng.setPower(pwr);
        eng.setType(type);
        eng.setName(name);
        this.color=colr;
        this.noTyres=ntyres;
    }
    ////getters
    public String getPower()
    {
        return eng.getPower();
    }
    
}
