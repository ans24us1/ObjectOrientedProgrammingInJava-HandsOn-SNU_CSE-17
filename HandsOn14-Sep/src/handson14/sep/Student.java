/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handson14.sep;
import java.util.*;
/**
 *
 * @author anuradha.ravi
 */
public class Student {
    private int sno;
    private float cgpa;
    private String emailID;
    private long phno;
    static int coursecredits;
    static ArrayList<Student> arrstu = new ArrayList<Student>();
    /*Student(int sno, float cgpa, String emailID, long phno)
    {
        this.sno=sno;
        this.cgpa=cgpa;
        this.emailID = emailID;
        this.phno=phno;
    }*/
    Student()
    {
        coursecredits=50;
    }
    void addStudent()
    {
        arrstu.add(this);
        System.out.println(this.cgpa+" "+this.coursecredits);
    }
    void setcgpa(float cgpa)
    {
        this.cgpa=cgpa;
        //System.out.println(arrstu.get(1).cgpa);
    }
    /*void setcoursecredits(int coursecredit)
    {
        coursecredits=coursecredit;
    }*/
}
