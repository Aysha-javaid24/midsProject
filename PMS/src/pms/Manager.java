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
public class Manager extends Employee{
   public List<Employee> employee;
   public Manager()
   {
       employee=new ArrayList<Employee>();
   }
    public void AddEmp(Employee e)
    {
        employee.add(e);
    }
    
}
