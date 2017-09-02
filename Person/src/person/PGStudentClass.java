/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author anuradha.ravi
 */
public class PGStudentClass extends StudentClass {
    
    PGStudentClass()
    {
        System.out.println("I am a PG Student and can " );
        walk();
        talk();
        drink();
        eat();
        coursecredits=40;
        System.out.println("I have to complete " + coursecredits + " credits and also do research.");
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
        System.out.println("I drink Coffee");
    }
    @Override
    public void walk()
    {
        System.out.println("I walk 15 Km");
    }
}
