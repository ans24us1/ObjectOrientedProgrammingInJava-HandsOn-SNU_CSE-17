/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson21.pkg9;
import java.util.ArrayList;
/**
 *
 * @author anuradha.ravi
 */
public interface Machines {
    String sensorName="collisionSensor";
    default ArrayList<String> Func(String sname)
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Hello");
        str.add("Sensor");
        return str;
    }
    String sense();
}
