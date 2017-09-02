/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson21.pkg9;
import java.util.*;
/**
 *
 * @author anuradha.ravi
 */
public class DriverlessCar extends Car implements Machines {
    
    ArrayList<String> str;
    DriverlessCar(int vid,String vname,long RegNo)
    {
                super(vid,vname,RegNo);

        str=Func("Hello");
        
        
    }
    void funcPrint()
    {
        System.out.println(str);
        Print();
    }
    public String sense()
    {
        String str="I have sensed";
       return str;
    }
    
    void MoveForward()
    {
        String str=sense();
        System.out.println("Move forward "+str);
        
        increasevol1();
    }
}
