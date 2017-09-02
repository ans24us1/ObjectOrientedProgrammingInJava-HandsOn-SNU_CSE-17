/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson14.sep;

/**
 *
 * @author anuradha.ravi
 */

public class UGStudent extends Student {
    
    
    
    UGStudent()
    {
        
    }
    
    UGStudent(int sno, float cgpa, String emailID, long phno){
        
        setcgpa(cgpa);
        coursecredits = 123;
    }
}
