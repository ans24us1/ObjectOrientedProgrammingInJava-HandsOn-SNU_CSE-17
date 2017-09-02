/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.lang.*;
/**
 *
 * @author anuradha.ravi
 */
abstract public class StudentClass implements PersonInterface {
    
    int stdno;
    long coursecredits;
    StringBuilder lastname=new StringBuilder();
    String firstname;
    String branch;
    int[] sgpa = new int[10];
    
    abstract public long CalcCGPA(int[] sgpa);
    public void finalize(){System.out.println("finalize called");}  
    
}
