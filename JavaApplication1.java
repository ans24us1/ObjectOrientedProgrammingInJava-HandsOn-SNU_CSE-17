/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.IOException;
import java.util.*;
import java.lang.StringBuffer;
/**
 *
 * @author anuradha.ravi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<Student> studentarray = new ArrayList<Student>();
        Student s = null;
        System.out.println("How many students? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s = new Student();
            s.takeInput();
            studentarray.add(s);
        }
        

        System.out.println("Enter the student number to print : ");
        int sno = sc.nextInt();
        for(Student s1:studentarray)
        {
            if(s1.sno==sno){
                s=s1;
            //s=s1;
            break;}
        }
        s.PrintStudent();
    }
    
}
