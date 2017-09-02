/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author anuradha.ravi
 */

public class Student {
    int sno;
    StringBuffer fname;
    String lname;
    ArrayList<Integer> marks = new ArrayList<Integer>();
    long phno;
    float cgpa;
    int sttry1;
    static int sttry;
    void takeInput() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter student number : ");
        this.sno = Integer.parseInt(br.readLine());
        System.out.println("Enter student first name : ");
        this.fname = new StringBuffer(br.readLine()) ;
        System.out.println("Enter student last name : ");
        this.lname = br.readLine();
                System.out.println("Enter student phone no : ");

        this.phno = Long.parseLong(br.readLine());
                System.out.println("Enter student cgpa : ");

        this.cgpa = Float.parseFloat(br.readLine());
        System.out.println("Enter how many marks : ");
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the mark : ");
            marks.add(Integer.parseInt(br.readLine()));            
        }
    }
    void PrintStudent()
    {
       System.out.println("The student details are : "+this.sno+" "+this.fname+" "+this.lname+" ");
    }
    Student(int sno, long phno, float cgpa)
    {
        this.sno=sno;
        this.phno = phno;
        this.cgpa = cgpa;
    }
    Student()
    {
        sttry++;
    }
    
    Student(String lname)
    {
        this.lname=lname;
    }
    static void trystatic()
    {
        /*int i=0;
        i++;
        System.out.println("The value of i is : "+i);*/
        sttry++;
        //phno = 24238746287346;
        
    }
    void trystatic1()
    {
        sttry1++;
    }
}
