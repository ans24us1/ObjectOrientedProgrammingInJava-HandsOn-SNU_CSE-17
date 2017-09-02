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
public class PGStudent extends Student {
    
    PGStudent(float cgpa)
    {
        setcgpa(cgpa);
        coursecredits = 23;
    }
    
    PGStudent(int sno, float cgpa, String emailID, long phno){
        
        setcgpa(cgpa);
        coursecredits = 23;
    }
}
