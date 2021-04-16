/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms;

/**
 *
 * @author aysha
 */
import java.util.List;
import java.util.ArrayList;
public class Employee {
    private String Name;
    private String Email;
    private String Cell_Num;
    public String Gender;
    List<Employee> list;
    public Employee()
    {
        list=new ArrayList<Employee>();
    }
    ///setter for name
    public boolean setName(String name)
    {
        boolean flag=false;
        int size=name.length();
        for(int i=0;i<size;i++)
        {
            if((name.charAt(i)>='a' && name.charAt(i)<='z')||(name.charAt(i)>='A' && name.charAt(i)<='Z')||(name.charAt(i)==' '))
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            this.Name=name;
        }
        return flag;
    }
    ////getter for name
    public String getName()
    {
        return this.Name;
    }
    ////setter for email
    public boolean setEmail(String email)
    {
        boolean flag=false;
        int size=email.length();
        for(int i=0;i<size;i++)
        {
            if(email.charAt(i)>='a'&&email.charAt(i)<='z')
            {
                if(email.charAt(i)>='0'&&email.charAt(i)<='9')
                {
                    if(email.charAt(i)=='@')
                    {
                        flag=true;
                    }
                }
            }
        }
        if(flag==true)
        {
            this.Email=email;
        }
        return flag;
    }
    ////getter for email
    public String getEmail()
    {
        return this.Email;
    }
    ////setter for cell number
    public boolean setContactNum(String num)
    {
        boolean flag=false;
        int size=11;
        for(int i=0;i<11;i++)
        {
            if(num.charAt(i)>='0'&&num.charAt(i)<='9')
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            this.Cell_Num=num;
        }
        return flag;
    }
     ////getter for contact number
    public String getContactNum()
    {
        return this.Cell_Num;
    }
}
