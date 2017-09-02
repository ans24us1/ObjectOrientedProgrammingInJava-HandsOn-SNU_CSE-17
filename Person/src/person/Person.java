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
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sgpa = new int[10];
        PersonInterface PIU,PIP;
        PIU = new UGStudentClass();
        PIP = new PGStudentClass();
        
        PIU.drink();
        PIP.walk();
        //PIP.calcCGPA();
        for(int i=0;i<5;i++)
            sgpa[i]=i+5;
        UGStudentClass UG = new UGStudentClass(1,"ABC");
        long cgpa=UG.CalcCGPA(sgpa);
        
        System.out.println("cgpa : "+cgpa);
       // UG.finalize();
        UG=null;
        
    }
    
}
