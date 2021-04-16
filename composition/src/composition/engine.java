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
public class engine {
    private String Type;
    private String Name;
    private String power;
    public void setName(String name){
        this.Name=name;
    }
    public void setPower(String power)
    {
        this.power=power;
    }
    public void setType(String type)
    {
        this.Type=type;
    }
    public String getPower()
    {
        return this.power;
    }
}
