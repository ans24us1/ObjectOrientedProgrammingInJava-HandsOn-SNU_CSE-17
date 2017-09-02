/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Arrays;

/**
 *
 * @author anuradha.ravi
 */
public class UGStudentClass extends StudentClass {
    @Override
    public void finalize(){super.finalize(); System.out.println("finalize called");}  
    
    UGStudentClass()
    {
        String[] clubs = new String[]{"abc","cdf","ert"};
        System.out.println("I am a UG Student and can " );
        walk();
        talk();
        drink();
        eat();
        coursecredits=70;
        System.out.println("I have to complete " + coursecredits + " credits and part of "+Arrays.toString(clubs)+" clubs");
    }
    UGStudentClass(int stdno, String branch)
    {
        this.stdno = stdno;
        this.branch = branch;
    }
    @Override
    public long CalcCGPA(int[] sgpa)
    {
        long cgpa=0;
        for(int sgpai:sgpa)
            cgpa+=sgpai;
        return cgpa ; 
    }
    @Override
    public void drink()
    {
        super.drink();
        System.out.println("I drink Pepsi");
    }
    @Override
    public void walk()
    {
        System.out.println("I walk 20Km");
    }
}
